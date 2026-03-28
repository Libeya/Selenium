package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		/*
		 * navigate to demoworkshop
		 * then click on computers by using partiallinktext
		 */
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("C")).click();
//		
		
		/*
		 * navigate to flipkart
		 * then close the pop up cancel and 
		 * then click on login link using partiallinktext
		 */
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		
		
		

	}

}
