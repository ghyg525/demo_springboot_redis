package org.yangjie;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yangjie.config.WebMvcConfig;

/**
 * 程序入口, 启动器
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	
	private static Logger logger = Logger.getLogger(Application.class);

	
	public static void main(String[] args) {
		
		SpringApplication.run(WebMvcConfig.class, args);
		
		logger.info("server is running...");
		
	}
 
}
