package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to automation 
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//2. click on the dropdown
		WebElement drop=driver.findElement(By.id("Skills"));
		drop.click();
		Thread.sleep(2000);
		
		//3.select the 10th option
		drop.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.
				ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.
				ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		

	}

}
