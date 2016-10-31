package org.yangjie.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.yangjie.entity.User;

@Repository
public class UserDao {
	
	Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	private User user; // 数据应从数据仓库获取, 此处暂放内存测试
	
	
	public User get(int userid){
		logger.info("从数据库中查询用户: user");
		if(user!=null && user.getUserid()==userid){
			return user;
		}
		return null;
	}
	
	public boolean add(User user){
		logger.info("从数据库中添加用户: user");
		this.user = user;
		return true;
	}
	
	public boolean delete(int userid){
		logger.info("从数据库中删除用户: user");
		if (user!=null && user.getUserid()==userid) {
			this.user = null;
		}
		return true;
	}
	
	public boolean update(User user){
		logger.info("从数据库中更新用户: user");
		this.user = user;
		return true;
	}
	
	
}
