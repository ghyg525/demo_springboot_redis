package org.yangjie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yangjie.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;  
	
	@RequestMapping("/user/{userid}")
	public void get(@PathVariable int userid) {
		System.out.println(userService.get(userid).getUserid());
	}
	
	
}
