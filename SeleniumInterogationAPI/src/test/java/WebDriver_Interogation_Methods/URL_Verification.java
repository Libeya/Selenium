package WebDriver_Interogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Verification {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			// 1.navigate to demo workshop
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			//2. fetch and compare
			
			String Expected_Url="https://demowebshop.tricentis.com/";
			String Actual_Url=driver.getCurrentUrl();
			
			if(Actual_Url.equals(Expected_Url))
			{
				System.out.println("The URL matches successfully");
			}
			
			else
			{
				System.out.println("URL matches failed");
			}
	}

}
