package org.yangjie.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("org.yangjie")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
}
