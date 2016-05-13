package com.ssm.showcase.user.service;

import java.util.List;

import com.ssm.showcase.user.domain.User;

public interface UserService {
	
	public  void addUser(User user);
	
	public List<User> findAllUsers();
	
	public List<User> addAndSearch(User user);

}
