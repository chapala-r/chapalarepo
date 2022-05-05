package com.user.service;

import org.springframework.http.ResponseEntity;

import com.user.dto.FlatUserDto;
import com.user.dto.UserDto;

public interface UserService {

	public String saveUser(UserDto user);
	public Object getAllFlat();
	public ResponseEntity<String> saveFlat(FlatUserDto dto);
	
}
