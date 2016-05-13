package com.ssm.showcase.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.showcase.user.domain.User;
import com.ssm.showcase.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(User user){
		
		userService.addAndSearch(user);
		
		return "userList";
	}

}
