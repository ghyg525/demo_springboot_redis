package org.yangjie.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.yangjie.dao") // 扫描dao接口, 自动生成代理实现
public class SqlSessionConfig {

	/**
	 * 注册mybatis的SqlSessionFactory
	 * @return
	 */
	@Bean // DataSource由springboot自动创建 (yml中必须配置spring.datasource)
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource); // 设置数据源
		return sessionFactoryBean.getObject();
	}
	
}
