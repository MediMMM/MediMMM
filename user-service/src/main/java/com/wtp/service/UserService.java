package com.wtp.service;

import java.util.List;

import com.wtp.entity.User;

public interface UserService {
	
	public String addUser(User user);
	
	public String addUsers(List<User> users);
	
	public List<User> getAllUsers();



}
