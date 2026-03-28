package navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//2.navigate to flipkart
		URL urlref1=new URL("https://www.flipkart.com/");
		driver.navigate().to(urlref1);
		
		//3.navigate to UberEats
		driver.navigate().to(new URL("https://www.ubereats.com/"));

	}

}
