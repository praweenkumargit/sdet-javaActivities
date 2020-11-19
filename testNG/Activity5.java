package com.ibm.TestNG_Projects.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
  @Test
  public void a() {
	  Assert.assertEquals(driver.getTitle(), "Target Practice");   
	  
  }
  @Test ( groups = {"HeaderTests"})
  public void b() {
	  WebElement thirdheader = driver.findElement(By.cssSelector("h3"));
	  String actual = thirdheader.getText();
	  String expected = "Third header";
	  Assert.assertEquals(actual, expected);
	  
	  WebElement fifthheader = driver.findElement(By.cssSelector("h5.ui.header"));
	  Assert.assertEquals(fifthheader.getCssValue("color"), "rgb(33, 186, 69)");
	 
	  ;
	 
  }
  
  @Test ( groups = {"ButtonTests"})
  public void c() {
	  WebElement olive = driver.findElement(By.cssSelector("button.olive"));
	  String actual = olive.getText();
	  String expected = "Olive";
	  Assert.assertEquals(actual, expected);
	  
	  WebElement red = driver.findElement(By.cssSelector("button.red"));
	  Assert.assertEquals(red.getCssValue("color"), "rgb(255, 255, 255)");
	  
  }
  @BeforeClass (alwaysRun = true)
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterClass (alwaysRun = true)
  public void afterClass() {
	  driver.close();
  }

}
