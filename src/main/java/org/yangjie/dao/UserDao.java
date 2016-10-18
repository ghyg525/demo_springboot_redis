package org.yangjie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.yangjie.entity.User;

@Mapper // 注解为mybatis的Mapper, 自动生成代理实现
public interface UserDao {
	
	@Select("select * from user where username=#{username} and password=#{password}")
	public User select(@Param("username")String username, @Param("password")String password);
	
}
