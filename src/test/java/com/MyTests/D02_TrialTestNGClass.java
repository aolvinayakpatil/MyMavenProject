package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D02_TrialTestNGClass {
	WebDriver driver;
  @Test
  public void testMyntra() 
  {
	  driver.get("https://www.myntra.com/");
		System.out.println("Title: "+driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test");
		driver.close();
  }

}
