package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Multiple_Attributes {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='vl-flyout-nav__link-container' and @_sp='p4624852.m1379.l3250' and @href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545']")).click();
	}

}
