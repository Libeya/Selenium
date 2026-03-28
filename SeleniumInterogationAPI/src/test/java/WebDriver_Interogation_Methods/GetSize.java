package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//2.Locate the search btn
		WebElement searchbtn=driver.findElement(By.id("nav-search-submit-button"));
		Dimension dim=searchbtn.getSize();
		System.out.println("The dimension of the search button is: "+dim);
		
		//3.Fetch the height
		System.out.println(dim.getHeight());
		System.out.println(dim.height);
		
		//4. Fetch the width
		System.out.println(dim.getWidth());
		System.out.println(dim.width);
		System.out.println(searchbtn.getCssValue("height"));
		
	}

}
