package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to automation 
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		// 2. select the checkbox
		WebElement cricket=driver.findElement(By.id("checkbox2"));
		cricket.click();
		Thread.sleep(2000);
		
		
		//3. unselect the checkbox
		cricket.click();
		
	}

}
