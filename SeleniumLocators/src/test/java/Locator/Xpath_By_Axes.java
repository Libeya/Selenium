package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_By_Axes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"
//				+ "/parent::h2/following-sibling::div[@class='add-info']"
//				+ "/child::div[@class='buttons']")).click();
//		
//	
		
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//to close pop-up
		driver.findElement(By.xpath(
				"//img[@src='https://jsak.mmtcdn.com/pwa/platform-myra-ui/static/sub_icons/close-icon.png']"))
		.click();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		
		
		driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']"
				+ "/parent::div/parent::div/following-sibling::"
				+ "div/child::div//a[.='BOOK NOW']")).click();
		

	}

}
