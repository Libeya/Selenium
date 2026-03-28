package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement link: allLinks)
		{
			System.out.println(link.getText());
			
		}
		for(WebElement link: allLinks) {
			if(link.getText().contains("Store"))
			{
				link.click();
			   break;
			}
		}
	}
		
	}


