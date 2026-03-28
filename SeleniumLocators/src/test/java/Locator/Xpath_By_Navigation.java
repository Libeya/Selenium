package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Navigation {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/#");
		driver.manage().window().maximize();
		
		//same nav link name for all specify the number the exact thing will get opened
		driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
		
		
		

	}

}
