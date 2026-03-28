package Locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
		}

}
