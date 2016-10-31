package org.yangjie.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yangjie.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

	@Autowired
	private UserService userService;
	
	
	@Test
	public void test() {
		
		User user = new User();
		user.setUserid(1);
		user.setUsername("name");
		
		logger.info("添加用户1: {}", userService.add(user));
		logger.info("获取用户1: {}", userService.get(1));
		logger.info("再次获取用户1: {}", userService.get(1));
		logger.info("删除用户1: {}", userService.delete(1));
		logger.info("获取用户1: {}", userService.get(1));
		logger.info("再次获取用户1: {}", userService.get(1));
		logger.info("修改用户1: {}", userService.update(user));
		logger.info("获取用户1: {}", userService.get(1));
		logger.info("再次获取用户1: {}", userService.get(1));

	}

}
