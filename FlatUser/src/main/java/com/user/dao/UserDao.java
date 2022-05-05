package com.user.dao;

import com.user.dto.FlatUserDto;
import com.user.dto.UserDto;
import com.user.model.User;

public interface UserDao {
	public String saveUser(UserDto userdto);
	public String saveFlat(FlatUserDto dto);
}
