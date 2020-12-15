package Package;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3_1 {
	   AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;
  @Test
  public void f() {
      // Locate the button to write a new message and click it
		
      driver.findElement(MobileBy.AndroidUIAutomator("description(\"Create New Message\")")).click();
	
      // Enter the number to send message to
	
      String contactBoxLocator = "resourceId(\"com.samsung.android.messaging:id/recipients_editor_to\")";
	
      // Enter your own phone number
	
      driver.findElement(MobileBy.AndroidUIAutomator(contactBoxLocator)).sendKeys("9903305762");
	// Focus on the message text box
	
      String messageBoxLocator = "resourceId(\"com.samsung.android.messaging:id/message_edit_text\")";
	
      driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator)).click();
	// Type in a message
	
      messageBoxLocator = "resourceId(\"com.samsung.android.messaging:id/message_edit_text\")";
	
      MobileElement composeMessageInput = driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator));
	
      composeMessageInput.sendKeys("Hello from Appium");
	// Send the message
	
      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.samsung.android.messaging:id/send_button1\")")).click();
	// Wait for message to show
	
      wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("message_text_view")));
	 // Assertion
	
      String messageLocator = "resourceId(\"com.samsung.android.messaging:id/message_edit_text\")";
	
      String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
	
      Assert.assertEquals(sentMessageText, "Hello from Appium");
	 
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "<device name>");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.samsung.android.messaging");
      caps.setCapability("appActivity", ".ui.view.main.WithActivity");
      caps.setCapability("noReset", true);

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver, 5);
  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
