package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to automation demo site
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//2. select the female radiobtn
		driver.findElement(By.cssSelector("[value='Female']")).click();
	}

}
