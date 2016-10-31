package org.yangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.yangjie.dao.UserDao;
import org.yangjie.entity.User;

@Service
@CacheConfig(cacheNames="user")
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	@Cacheable(key="'user_'+#userid")
	public User get(int userid){
		return userDao.get(userid);
	}
	
	@CachePut(key="'user_'+#user.userid")
	public User add(User user){
		userDao.add(user);
		return user;
	}
	
	@CacheEvict(key="'user_'+#userid")
	public boolean delete(int userid){
		return userDao.delete(userid);
	}
	
	@CacheEvict(key="'user_'+#user.userid")
	public boolean update(User user){
		return userDao.update(user);
	}
	
	
}
