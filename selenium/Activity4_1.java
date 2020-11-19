package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
	//Get the title of the page using driver.getTitle() and print out the title.	
		System.out.println("Page title - " + title);
	//	Use findElement() with xpath() to find and click the "About Us" link on the page.
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
	//Print the title of the new page that open when the link is clicked.	
	 System.out.println(driver.getTitle());

	}

}
