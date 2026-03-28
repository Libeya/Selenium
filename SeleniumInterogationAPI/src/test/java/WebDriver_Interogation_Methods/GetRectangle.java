package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;

public class GetRectangle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		
		//2.Locating Register Link
		WebElement reglink=driver.findElement(By.linkText("Register"));
		Rectangle rect=reglink.getRect();
		
		//3.Fetch Dimension along with height and width
		System.out.println(rect.getDimension());
		System.out.println(rect.getHeight());
		System.out.println(rect.height);
		System.out.println(rect.getWidth());
		System.out.println(rect.width);
		
		//4.Fetching Point co-ordinates along with x and y offsets
		System.out.println(rect.getPoint());
		System.out.println(rect.getX());
		System.out.println(rect.x);
		System.out.println(rect.getY());
		System.out.println(rect.y);
		
		driver.quit();
		

	}

}
