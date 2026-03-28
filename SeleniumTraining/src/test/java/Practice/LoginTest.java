package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Step 2 Navigate to webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//Step 3 Enter username and pwd
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		WebElement homepage=driver.findElement(By.xpath("//h6"));
		if(homepage.isDisplayed())
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login Failed");
		}

	}

}
