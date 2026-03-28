package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_StartsWith {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital downloads')]")).click();
	
	driver.get("https://www.ebay.com/");
	Thread.sleep(2000);
	
	/* 
	 * two ways
	 * 1. to directly click on the toys link
	 * 2. to search in search field and click
	 */
	
	driver.findElement(By.xpath("//span[starts-with(text(),'Toys')]")).click();
	
	driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("Toys",Keys.ENTER);
	
	
	}

}
