package org.yangjie.service;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.yangjie.BaseTest;

public class UserServiceTest extends BaseTest{

	@Resource
	private UserService userService;
	
	@Test
	public void testGet() {
		assertNotNull(userService.get(1));
	}

}
