package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		
		System.out.println(driver.getTitle());
		
		
		WebElement keyPressed = driver.findElement(By.xpath("//div[@id='keyPressed']"));
		
		Actions builder = new Actions(driver);
		builder.sendKeys("P").build().perform();
		
		System.out.println(keyPressed.getText());
		
		builder.keyUp(Keys.CONTROL).sendKeys("a").sendKeys("c").keyDown(Keys.CONTROL);
	
		driver.close();
		

		
		
		
		

	}

}
