package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.FlatUserDto;
import com.user.dto.UserDto;
import com.user.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDto userDto) {
		return userService.saveUser(userDto);
	}
	
	@GetMapping("/flat")
	public Object getFlat() {
		return userService.getAllFlat();
	}
	
	@PostMapping("/saveFlat")
	public ResponseEntity<String> saveFlat(@RequestBody FlatUserDto dto) {
		return userService.saveFlat(dto);
	}

}
