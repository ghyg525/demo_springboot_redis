package org.yangjie.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yangjie.dao.UserDao;
import org.yangjie.entity.User;

@Service
@Transactional
public class UserService {
	
	@Resource
	private UserDao userDao;  
	
	public User get(int userid) {
		return userDao.select(userid);
	}
	
}
