package com.ibm.TestNG_Projects.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
  @Test
  public void first() {
	Assert.assertEquals(driver.getTitle(), "Target Practice");   
	  
  }
  @Test
  public void second() {
	   WebElement imaginary = driver.findElement(By.linkText("haha"));
	  driver.findElement(By.xpath("//button[@class='black']"));
	  Assert.assertTrue(imaginary.isDisplayed());
  }
  @Test (enabled = false)
  public void third() {
	 System.out.println("skip");  
	  
  }
  @Test
  public void fourth() {
	  String condition ="Skip Test";

	    if(condition.equals("Skip Test")){
		throw new SkipException("Skipping - This is not ready for testing ");
	    } else {
		System.out.println("ready");
	    } 
	   
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
