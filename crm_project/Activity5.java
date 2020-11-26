package crm.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
public class Activity5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "http://alchemy.hguy.co/crm";
		String UserId = "admin";
		String Pwd = "pa$$w0rd";
		String colortoVerify ="#534D64";
		
		
        //Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
	
        //Launch the CRM Application
		driver.get(URL);
		
		WebElement UserName =     driver.findElement(By.xpath("//*[@id='user_name']"));
		WebElement Password = 	  driver.findElement(By.xpath("//*[@id='username_password']"));
		WebElement LoginButton =  driver.findElement(By.xpath("//*[@id='bigbutton']"));
		
		UserName.sendKeys(UserId);
		Password.sendKeys(Pwd);
		
		LoginButton.click();
		
		String ColorRGB =  driver.findElement(By.xpath("//*[@id='toolbar']/ul")).getCssValue("color");
		String hexColorCode = Color.fromString(ColorRGB).asHex();
		
		System.out.println("Color1"+ColorRGB);
		System.out.println("Color2"+hexColorCode);
		Assert.assertEquals(colortoVerify, hexColorCode);
		
		driver.close();
		
		
		
	
	}
}
