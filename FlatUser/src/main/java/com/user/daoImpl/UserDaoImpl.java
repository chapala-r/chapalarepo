package com.user.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.dao.UserDao;
import com.user.dto.FlatUserDto;
import com.user.dto.UserDto;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String saveUser(UserDto userdto) {
		try {
			jdbcTemplate.update("INSERT INTO users(name, mob_no,email,address) VALUES (?,?,?,?)", userdto.getName(),
					userdto.getMobileNo(), userdto.getEmail(), userdto.getAddress());
			return "Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed";
		}
	}

	@Override
	public String saveFlat(FlatUserDto dto) {
		try {
			jdbcTemplate.update("INSERT INTO flat_user(id, name, flat_no, location, city, type, price) VALUES (?,?,?,?,?,?,?)", dto.getId(), dto.getName(),
					dto.getFlatNo(), dto.getLocation(), dto.getCity(), dto.getType(), dto.getPrice());
			return "Success";
		}catch(Exception e) {
			e.printStackTrace();
		return "Failed";
	}
	}
	
		
	

}
