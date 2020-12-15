package AppiumProjectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity4 {
	 AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;
  @Test
  public void f() {
	
	// Scroll to To do list
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"To-Do List\")")).click();
	  
	  driver.findElementByClassName("android.widget.EditText").sendKeys("task1");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button").click();
	  driver.findElementByClassName("android.widget.EditText").sendKeys("task2");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button").click();
	  driver.findElementByClassName("android.widget.EditText").sendKeys("task3");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button").click();
	  
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]").click();
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]").click();
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[4]").click();
	  
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.TextView").click();
	  
	// Assertion after scrolling
	
     // Assert.assertEquals(numberOfImages.size(), 4);
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
		
      caps.setCapability("deviceId", "RZ8M91SS09V");
      caps.setCapability("deviceName", "My Phone");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.chrome");
	  caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
      caps.setCapability("noReset", true);
      
   // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps); 
      wait = new WebDriverWait(driver, 12);
  	
      driver.get("https://www.training-support.net/selenium");
  
  }

  @AfterClass
  public void afterClass() {
  }

}
