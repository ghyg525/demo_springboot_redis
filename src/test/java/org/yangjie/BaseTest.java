package org.yangjie;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;;

/**
 * Junit测试基类
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = WebMvcConfig.class)
public class BaseTest{
	
	@Autowired
	protected WebApplicationContext context;
	
}
