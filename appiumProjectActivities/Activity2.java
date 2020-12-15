package AppiumProjectActivities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity2 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;

  @Test
  public void f() {
	  
 driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/new_note_button\")")).click();
	 
	  
	  String titleNameLocator = "resourceId(\"com.google.android.keep:id/editable_title\")";
	  String detailsLocator = "resourceId(\"com.google.android.keep:id/edit_note_text\")";	
   
	
      driver.findElement(MobileBy.AndroidUIAutomator(titleNameLocator)).sendKeys("new title");
      driver.findElement(MobileBy.AndroidUIAutomator(detailsLocator)).sendKeys("details added");
	
      String saveButtonLocator = "description(\"Open navigation drawer\")";
	
      driver.findElement(MobileBy.AndroidUIAutomator(saveButtonLocator)).click();
	 
	  
	  List<MobileElement>tasks = driver.findElements(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/browse_note_interior_content\")"));
	
	 
	 Assert.assertNotNull(tasks);
	  
	  
	  
  }
  
  
  @BeforeClass

	  public void beforeClass() throws MalformedURLException {
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("deviceId", "RZ8M91SS09V");
	      caps.setCapability("deviceName", "My Phone");
	      caps.setCapability("platformName", "Android");
	      caps.setCapability("appPackage", "com.google.android.keep");
	      caps.setCapability("appActivity", ".activities.BrowseActivity");
	      caps.setCapability("noReset", true);

	      // Instantiate Appium Driver
	      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	      driver = new AndroidDriver<MobileElement>(appServer, caps);
	      wait = new WebDriverWait(driver, 5);
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
