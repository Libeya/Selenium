package WebDriver_Interogation_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//2. Locating the ABOUT Link
		WebElement elem=driver.findElement(By.id("navbarDropdown"));
		
		//3. To fetch the text of the link
		System.out.println("Name of the link is :"+elem.getText());
		
		//4. To fetch the tag name of the link
		System.out.println("Tag Name of the link is :"+elem.getTagName());

	}

}
