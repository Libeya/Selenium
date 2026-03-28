package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//2. Target the first radio btn
		WebElement radio=driver.findElement(By.id("pollanswers-1"));
		
		//3. Verify the btn is selected
		System.out.println("Is the Excellent btn selected: "+radio.isSelected());
		
		//4.clicking on the radio btn
		radio.click();
		Thread.sleep(2000);
		
		//5. Verify the btn is selected
		System.out.println("Is the Excellent button selected after clicking: "+radio.isSelected());
		
		driver.quit();
		

	}

}
