package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(9000);
		
		//2. Targeting check btn
		WebElement checkbtn= driver.findElement(By.id("Check"));
		
		//3.Verifying if the btn is enabled
		System.out.println("Is my check btn enabled: "+checkbtn.isEnabled());
		
		

		
		
	}

}
