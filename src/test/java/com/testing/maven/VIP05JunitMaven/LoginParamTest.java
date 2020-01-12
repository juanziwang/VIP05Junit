package com.testing.maven.VIP05JunitMaven;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoginParamTest {
	private static LoginSample ls;
	private static String user;
	private static String pwd;
	private static String except;
	
	//构造方法用于完成成员变量的肤质
	public LoginParamTest(String param1, String param2, String param3) {
		user = param1;
		pwd = param2;
		except = param3;
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ls = new LoginSample();
				
	}


	@Test
	public void test() {
		ls.login(user, pwd);
		assertEquals("登录测试结果",  ls.resultMSG, except);
	}
	
	//生成和返回测试数据供测试类使用
	@Parameters(name = "预期：{2}")
	public static Object[][] loginData(){
		Object[][] loginData = new Object[][] {
			{"Roy", "123456", "恭喜您，登录成功"},
			{"roy", "123456","用户名或密码错误！"},
			{"r", "123456","用户名密码长度应是3-16位！"},
			{null, "123456","用户名密码不能为空！"},
			{"Roy", "1234566666666666666666","用户名密码长度应是3-16位！"}
		};
		return loginData;
	}

}
