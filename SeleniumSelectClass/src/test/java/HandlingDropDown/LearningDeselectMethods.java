package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeselectMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//1. Navigate to WebPage
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//2. Locating the list-box
		Select sel= new Select(driver.findElement(By.id("select-multiple-native")));
		
		//3.select by index for multiple drop down
		sel.selectByVisibleText("John Hardy Women's L...");
		// de-select by index
		sel.deselectByIndex(4);
		Thread.sleep(2000);
		
		
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		//De-select by Visible Text
		sel.deselectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		
		
		sel.selectByVisibleText("White Gold Plated Pr...");
		//De-select by value
		sel.deselectByValue("White Gold Plated Princess");
		 Thread.sleep(2000);
		 
	 
      	sel.selectByVisibleText("Pierced Owl Rose Gol...");
		//De-select by containsVisibleText
		sel.deSelectByContainsVisibleText("Pierced Owl Rose Gol...");
		Thread.sleep(2000);
		
		//4.To add the selected items
		driver.findElement(By.xpath("//button[.='Add']")).click();
		Thread.sleep(2000);
	

	}

}
