package com.testing.maven.VIP05JunitMaven;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PlusDoubleTest {
	private static Plus ls;
	private static double da, db;
	private static double expect;

	public PlusDoubleTest(String caseName, double result, double a, double b) {
		// TODO Auto-generated constructor stub
		expect = result;
		da = a;
		db = b;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ls = new Plus();
	}

	@Test
	public void test() {
		double result = ls.sum(da, db);
		System.out.println(result);
		assertEquals(expect+"", result+"");
	}
	@Parameters(name="{0}")
	public static Object[][] intData(){
		return new Object[][] {
			{"两个整数相加", 300.0, 100, 200},
			{"一个整数和一个小数", 105.96, 100, 5.96},
			{"两个小数相加",9.4, 1.6, 7.8},
			{"小数部分超过六位",11.2469133 ,5.1234566, 6.1234567},
		};
	}

}
