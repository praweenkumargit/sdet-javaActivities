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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity1 {
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
  @Test
  public void f() {
	 
	  
	  driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")")).click();
	 
	  
	  String tasktextLocator = "resourceId(\"com.google.android.apps.tasks:id/add_task_title\")";
		
      // Enter your own phone number
	
      driver.findElement(MobileBy.AndroidUIAutomator(tasktextLocator)).sendKeys("Complete Activity with Google Tasks");
	// Focus on the message text box
	
      String saveButtonLocator = "resourceId(\"com.google.android.apps.tasks:id/add_task_done\")";
	
      driver.findElement(MobileBy.AndroidUIAutomator(saveButtonLocator)).click();
	  
      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")")).click();
      driver.findElement(MobileBy.AndroidUIAutomator(tasktextLocator)).sendKeys("Complete Activity with Google Keep");
      driver.findElement(MobileBy.AndroidUIAutomator(saveButtonLocator)).click();
      
      driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/tasks_fab\")")).click();
      driver.findElement(MobileBy.AndroidUIAutomator(tasktextLocator)).sendKeys("Complete the second Activity Google Keep");
      driver.findElement(MobileBy.AndroidUIAutomator(saveButtonLocator)).click();
	  
	  
	 
	  
	  List<MobileElement>tasks = driver.findElements(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/task_name\")"));
	  int tasksSize = tasks.size();
	  
	 Assert.assertEquals(3, tasksSize);
		 
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("deviceId", "RZ8M91SS09V");
      caps.setCapability("deviceName", "My Phone");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.google.android.apps.tasks");
      caps.setCapability("appActivity", ".ui.TaskListsActivity");
      caps.setCapability("noReset", true);

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver, 5);
	  
  }

  @AfterClass
  public void afterClass()  {
	
  
  }

}
