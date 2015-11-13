package org.yangjie.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	/**
	 * 配置数据源
	 * @return
	 */
	@Bean(name="dataSource")
	@ConfigurationProperties(prefix="dataSource")
	public DataSource initDataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
