package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		System.out.println(driver.getTitle());
		
		
		Actions builder = new Actions(driver);
		builder.click().build().perform();
		WebElement text = driver.findElement(By.xpath("//div[@class='active']"));

		
		System.out.println(text.getText());
		
		builder.doubleClick().build().perform();
		WebElement text2 = driver.findElement(By.xpath("//div[@class='active']"));
		
		System.out.println(text2.getText());
		
		builder.contextClick().build().perform();
		WebElement text3 = driver.findElement(By.xpath("//div[@class='active']"));
		
		System.out.println(text3.getText());
		
		driver.close();
		
		
		
		
		
		
		

	}

}
