package org.yangjie.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.yangjie.entity.User;

@Repository
public class UserDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public User select(int userid) {
		return jdbcTemplate.queryForObject("select * from user where userid=?", new BeanPropertyRowMapper<User>(User.class), userid);
	}
	
}
