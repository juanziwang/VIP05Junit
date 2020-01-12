package com.testing.maven.VIP05JunitMaven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlusDoubleTest.class, PlusTest.class ,LoginParamTest.class})
public class SuitTest {

}
