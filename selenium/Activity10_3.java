package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/drag-drop");
		
		System.out.println(driver.getTitle());
		
		WebElement ball = driver.findElement(By.xpath("//img[@id='draggable']"));
		WebElement dropzone1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(ball, dropzone1).build().perform();
		
		if (driver.findElement(By.xpath("//div[@id='droppable']/p")).getText().contains("Dropped")) {
			
			System.out.println("ball is in dropbox1");
			action.dragAndDrop(ball, dropzone2).build().perform();
		}
		else {
			System.out.println("ball IS NOT in dropbox1");
		}
		
		if (driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText().contains("Dropped")) {
			System.out.println("ball is in dropbox2");
			
		}
		
		driver.close();

	}

}
