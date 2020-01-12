package com.testing.maven.VIP05JunitMaven;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class LoginUnitTest {
	
	//为了让所有的方法都能使用被测类的实例化对象，生命为成员变量
	public static LoginSample ls;
	//在整个测试类之前的操作，经常用于进行测试准备工作
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("---------------测试前准备，完成ls的实例化---------------");
		ls = new LoginSample();
	}
	
	//测试方法
	@Test
	public void test() {
		boolean result = ls.login("Roy", "123456");
		assertEquals(result, true);
		assertTrue(result);
	}

}
