package selenium_project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity13 {
  @Test
  public void f() {
      WebDriver driver = new FirefoxDriver();
  	  JavascriptExecutor js = (JavascriptExecutor)driver;
	
      driver.get("https://www.training-support.net");
	
	
      String DomainName = js.executeScript("return document.domain;").toString();
	
      System.out.println("Domain name of the site: " + DomainName);
	
	
      String url = js.executeScript("return document.URL;").toString();
	
      System.out.println("URL of the site: " + url);
	
      String TitleName = js.executeScript("return document.title;").toString();
	
      System.out.println("Title of the page: " + TitleName);
	
      driver.close();
  }
}
