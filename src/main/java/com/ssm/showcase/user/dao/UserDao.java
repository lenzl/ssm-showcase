package com.ssm.showcase.user.dao;

import java.util.List;

import com.ssm.showcase.mybatis.annotation.MyBatisRepository;
import com.ssm.showcase.user.domain.User;


@MyBatisRepository
public interface UserDao {
	
	public void insertUser(User user);

	public List<User> findAllUsers();
}
