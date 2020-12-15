package AppiumProjectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;




import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


public class Activity5 {
	 AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;
  @Test (priority = 0)
  public void happyPathTest() {
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"Login Form\")")).click();
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]"
	  		+ "/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]"
		  		+ "/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]"
	  		+ "/android.view.View/android.view.View/android.widget.Button").click();
	  
	  
	 String acknowledgement = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]").getText();
	 
	 Assert.assertEquals(acknowledgement, "Welcome Back, admin");
	  
  }
  
  @Test (priority = 1)
  public void negativeTest() {
	  driver.get("https://www.training-support.net/selenium");
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"Login Form\")")).click();
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]"
	  		+ "/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]"
		  		+ "/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password2");
	  driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]"
	  		+ "/android.view.View/android.view.View/android.widget.Button").click();
	  
	  
	 String acknowledgement = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[3]").getText();
	 
	 Assert.assertEquals(acknowledgement, "Invalid Credentials");
	  
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
  public void afterClass()  {
	
  }

}
