package org.yangjie.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan("org.yangjie.dao")
public class SqlSessionConfig {

	@Autowired
	private DataSource dataSource;

	
	/**
	 * 注册mybatis的SqlSessionFactoryBean
	 * @return
	 */
	@Primary // 多实例时默认使用此实例
	@Bean(name="sqlSessionFactory")
	public SqlSessionFactoryBean getDBMoko() {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		return sqlSessionFactory;
	}
	
	/**
	 * 注册spring事务管理器
	 * @return
	 */
	@Bean
	DataSourceTransactionManager getTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
	
}
