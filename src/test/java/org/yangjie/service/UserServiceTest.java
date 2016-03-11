package org.yangjie.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.yangjie.BaseTest;

public class UserServiceTest extends BaseTest{

	@Autowired
	private UserService userService;
	
	
	@Test
	public void testGet() {
		assertNotNull(userService.get("1","1"));
	}

}
