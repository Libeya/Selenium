package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//2. navigate to youtube
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//3. navigate to wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(3000);
		driver.quit();
		
		//navigate is internally called get() method
		//so we can give it in first also..i,e google
		
		
		

	}

}
