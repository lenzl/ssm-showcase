package com.ssm.showcase.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.showcase.user.dao.UserDao;
import com.ssm.showcase.user.domain.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {	
		
		System.out.println("----addUser-----");
		
		userDao.insertUser(user);
		
//		throw new RuntimeException("--roll back---");
	}

	@Override
	public List<User> findAllUsers() {

		return userDao.findAllUsers();
	}

	@Override
	public List<User> addAndSearch(User user) {
		
		userDao.insertUser(user);	
		return userDao.findAllUsers();
	}

}
