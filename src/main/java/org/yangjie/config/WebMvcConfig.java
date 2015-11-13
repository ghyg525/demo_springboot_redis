package org.yangjie.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("org.yangjie")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Resource
	private DataSource dataSource;
	
	/**
	 * 注册spring数据库操作模版
	 * @return
	 */
	@Bean // 将方法返回值注册为spring管理bean
	JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
}
