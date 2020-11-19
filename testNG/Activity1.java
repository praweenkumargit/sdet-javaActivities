package com.ibm.TestNG_Projects.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
  @Test
  public void f() {
	  String title = driver.getTitle();
	  String expected = "Training Support";
	 
	  System.out.println(title);
	  
	  Assert.assertEquals(title, expected);
	  
	  driver.findElement(By.xpath("//a[@id='about-link']")).click();
	  System.out.println(driver.getTitle());
	  
	  Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
