package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        
        System.out.println("The title of website is " + title);
        Thread.sleep(1000);
        String str1 = driver.findElement(By.id("about-link")).getText();
        String str2 = driver.findElement(By.className("button")).getText();
        String str3 = driver.findElement(By.linkText("About Us")).getText();
        String str4 = driver.findElement(By.cssSelector("div.ui")).getText();
        
        System.out.println("id - " + str1 + " classname - "  + str2 +
        		" link text - " + str3 + " css selector - " + str4
        		);
        
        
        
        
        
        
}
}