package SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_implictwait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.findElement(By.linkText("Twitter")).click();
		
		driver.findElement(By.linkText("YouTube")).click();
		
		

	}

}
