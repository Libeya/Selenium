package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		/* Navigate to demoworkshop 
		 * and then click on Youtube*/
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("YouTube")).click();
		
		/* Navigate to google 
		 * and then click on gmail*/
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		
		

	}

}
