package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForth {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to myntra
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		// 2.navigate to bigbasket
		driver.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);
		
		//3.navigate to ajio
		driver.navigate().to("https://www.ajio.com/");
		Thread.sleep(2000);
		
		//4.go back to bigbasket from ajio
		driver.navigate().back();
		
		//5.verification
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//6.navigate forward to ajio
		driver.navigate().forward();
		
		//7.verification
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

	}

}
