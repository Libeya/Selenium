package WebDriver_Interogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Verification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// 2. fetch the title
		
		String Expected_Title="Demo Web Shop";
		String Actual_title= driver.getTitle();
		

		//3. compare 
		if(Actual_title.equals(Expected_Title))
		{
			System.out.println("The Navigation is successfull");
		}
		
		else
		{
			System.out.println("NaviagationFailed");
		}
	}

}
