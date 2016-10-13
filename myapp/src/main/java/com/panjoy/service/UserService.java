package com.panjoy.service;

import java.util.List;

import com.panjoy.domain.UserInfo;

public interface UserService {

	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}