package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("The title of website is " + title);
        driver.findElement(By.id("firstName")).sendKeys("praween");
        driver.findElement(By.id("lastName")).sendKeys("kumar");
        driver.findElement(By.id("email")).sendKeys("pkgmail@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9903305762");
        driver.findElement(By.className("ui")).click();
        driver.close();

	}

}
