package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//2. Locating the search text field
		WebElement search = driver.findElement(By.name("q"));
		
		//3. Fetching the location
		Point loc= search.getLocation();
		System.out.println(loc);
		
		//4. Fetch x offset
		System.out.println(loc.getX());
		System.out.println(loc.x);
		
		//5.Fetch y offset
		System.out.println(loc.getY());
		System.out.println(loc.y);
	}

}
