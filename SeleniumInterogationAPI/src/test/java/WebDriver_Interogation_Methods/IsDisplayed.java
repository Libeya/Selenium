package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo apps qspider
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		//2. target the register btn
		WebElement btn=driver.findElement(By.xpath("//button[.='Register']"));
		
		
		//3. verify the btn is displayed
		System.out.println(btn.isDisplayed());
		
		

	}

}
