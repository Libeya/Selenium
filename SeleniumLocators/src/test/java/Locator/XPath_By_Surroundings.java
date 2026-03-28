package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_By_Surroundings {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[text()='Build your own computer']/../..//input[@value=\"Add to cart\"]")).click();

		  
		  
		  driver.get("https://demoapps.qspiders.com/ui/duplicate");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//label[.='Samsung']/..//input[@type='checkbox']")).click();
		  driver.findElement(By.xpath("//label[.=' RedMi ']/..//input[@type='checkbox']")).click();
	}

}
