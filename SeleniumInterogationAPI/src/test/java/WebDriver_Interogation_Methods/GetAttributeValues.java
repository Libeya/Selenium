package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//2.Locating the search text field
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		
		//3. Fetch attribute value for a static attribute
		System.out.println(search.getDomAttribute("id")); //small-searchterms
		System.out.println(search.getDomProperty("id"));  //small-searchterms
		System.out.println(search.getAttribute("id"));    //small-searchterms
		
		//4.Fetch attribute value for a dynamic attribute
		System.out.println(search.getDomAttribute("value"));   //Search-store
		System.out.println(search.getDomProperty("value"));    //Search-store
		System.out.println(search.getAttribute("value"));      //Search-store
		Thread.sleep(2000);
		
		//5.Typing mobile in search field
		search.sendKeys("Mobile");
		
		System.out.println(search.getDomAttribute("value"));  //Search-store
		System.out.println(search.getDomProperty("value"));    //Mobile
		System.out.println(search.getAttribute("value"));    //Mobile
		
		driver.quit();
		
		

	}

}
