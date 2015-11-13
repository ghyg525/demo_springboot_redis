package org.yangjie;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.yangjie.service.UserServiceTest;

/**
 * 测试套件, 用于回归测试指定用例
 */
@RunWith(Suite.class)
@SuiteClasses({
	UserServiceTest.class,
})
public class SuiteTest{
	
}
