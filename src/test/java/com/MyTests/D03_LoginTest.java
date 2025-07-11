package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class D03_LoginTest {
  @Test(dataProvider = "getData",dataProviderClass = com.MyTests.ReadFromExcel.class)
  public void loginTest(String un, String ps,String rs) {
	  System.out.print(un);
	  System.out.print("\t" + ps);
	  System.out.println("\t" + rs);
  }
  @BeforeTest
  public void beforeTest() {
  }

}
