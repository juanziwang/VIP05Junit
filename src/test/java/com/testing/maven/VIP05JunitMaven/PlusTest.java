package com.testing.maven.VIP05JunitMaven;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PlusTest {
	private static Plus ls;
	private static int inta, intb;
	private static String expect;

	public PlusTest(String caseName, String result, int a, int b) {
		// TODO Auto-generated constructor stub
		expect = result;
		inta = a;
		intb = b;
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ls = new Plus();
	}

	

	@Test
	public void test() {
		int result = ls.sum(inta, intb);
		System.out.println(result);
		assertEquals(expect, result+"");
	}
	@Parameters(name="{0}")
	public static Object[][] intData(){
		return new Object[][] {
			{"左边界-1", "2147483647", -2147483648, -1},
			{"左边界+1", "-2147483647", -2147483648, 1},
			{"中间值相加", "1287", 598, 689},
			{"中间值相加越界","447493647" ,258963479, 188530168},
			{"右边界+1", "-2147483648", 2147483647, 1},
			{"右边界-1", "2147483646", 2147483647, -1}
		};
	}

}
