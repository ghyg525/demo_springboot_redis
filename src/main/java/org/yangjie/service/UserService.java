package org.yangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangjie.dao.UserDao;
import org.yangjie.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;  
	
	
	public User get(String username, String password) {
		return userDao.select(username, password);
	}
	
}
