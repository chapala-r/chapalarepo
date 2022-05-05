package com.user.serviceImpl;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.user.dao.UserDao;
import com.user.dto.FlatUserDto;
import com.user.dto.UserDto;
import com.user.helper.MailHelper;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	/*
	 * @Autowired JavaMailSender javaMailSender;
	 */

	@Override
	public String saveUser(UserDto user) {
		//validation
		if(null==user.getName()) {
			return "Please enter your name";
		}
		if(null==user.getEmail()) {
			return "Please enter your email";
		}
		String response = userDao.saveUser(user);
		if ("Success".equalsIgnoreCase(response)) {
			MailHelper mailHelper;
			try {
				mailHelper = new MailHelper("google-mail.properties");
				mailHelper.sendMail("chapalarout001@gmail.com", user.getEmail(), "Flat Registration", "Dear "
						+ user.getName() + " You are registered successfully to our FLAT portal. Thank You");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "User Resisterd Successfully Please verify your Email";
		} else {
			return "User Registration Failed.";
		}
	}

	@Override
	public Object getAllFlat() {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:9091/Flat/findAll";
		String response=restTemplate.getForObject(url, String.class);
		return response;
	}

	@Override
	public ResponseEntity<String> saveFlat(@RequestBody FlatUserDto dto) {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:9094/user/saveFlat";
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String requestJson="{\"id\":\""+dto.getId()+ "\", \"name\":\""+dto.getName() + 
				"\",\"flatNo\":\""+dto.getFlatNo()+"\",\"location\":\""+dto.getLocation()+
				"\",\"city\":\""+dto.getCity()+"\",\"type\":\""+dto.getType()+
				"\",\"price\":\""+dto.getPrice()+"\"}";
		
		try {
			System.out.println(requestJson);
			
			HttpEntity<String> entity=new HttpEntity<String>(requestJson,headers);
			ResponseEntity<String> response=restTemplate.postForEntity(url, entity, String.class);
			return response;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	
}
