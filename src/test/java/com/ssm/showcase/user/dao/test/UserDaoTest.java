package com.ssm.showcase.user.dao.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.showcase.user.dao.UserDao;
import com.ssm.showcase.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void addUser(){
		
		User user =new User();
		user.setUser_name("test_user_dao");
		
		userDao.insertUser(user);
	}
	
	@Test
	public void findAllUsers(){
		
		List<User> result = userDao.findAllUsers();
		
		assertThat(result).hasSize(9);
	}
		
	
}
