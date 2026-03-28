package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to automation 
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//2. Enter first name
		WebElement firstname =driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstname.sendKeys("Libeya");
		
		//3. Enter last name
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("S");
		Thread.sleep(2000);
		
		//4. clearing the first name
		firstname.clear();
		Thread.sleep(2000);
		
		//5. retying first name
		firstname.sendKeys("Mary");
		

	}

}
