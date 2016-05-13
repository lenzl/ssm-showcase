package com.ssm.showcase.user.service.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.showcase.user.domain.User;
import com.ssm.showcase.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-test.xml")
public class UserServiceTest{

	@Autowired
	private UserService userService;
	
	@Repeat(1)
	@Test
	public void testAddUser(){
		
		User user =new User();
		user.setUser_name("test_user_service");
		
		userService.addUser(user);
		
	}
	
	@Test
	public void testFindAllUsers(){

		List<User> result = userService.findAllUsers();
		
		assertThat(result).hasSize(9);
	}
	
	@Test
	public void addAndSearch(){
		
		User user =new User();
		user.setUser_name("test_user_servicedao");
		
		List<User> result = userService.addAndSearch(user);
		
		assertThat(result).hasSize(11);
	}
	
}
