package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List <WebElement> columns = driver.findElements(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr[1]/td"));
		System.out.println("Number of columns is " + columns.size());
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr"));
		System.out.println("Number of rows is " + rows.size());
		
		System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr[3]/td[2]")).getText());
		
		driver.findElement(By.xpath("//table[contains(@class, 'sortable')]/thead/tr[1]/th[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr[3]/td[2]")).getText());
		
        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
    	
        System.out.println("Table footer values: " + footer.getText());
        
        driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
