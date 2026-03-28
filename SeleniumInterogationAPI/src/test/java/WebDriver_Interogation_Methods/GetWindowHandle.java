package WebDriver_Interogation_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo apps qspider
		
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		
		
		//2. Fetches the window id
		
		System.out.println(driver.getWindowHandle());// returns the window id
		
        // 3.referesh the same page
		
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());// after refresh also id is same
		
		//4. re-navigate to the same webpage
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());// returns the same window id
		
		//5. navigate to some other website
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());// returns the same window id
		
		
		
	}

}
