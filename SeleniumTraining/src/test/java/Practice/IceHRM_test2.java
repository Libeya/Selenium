package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IceHRM_test2 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@onclick='submitLogin();return false;']")).click();
		
		driver.findElement(By.id("menu_admin_Employees")).click();
		
		driver.findElement(By.xpath("//a[@href='https://icehrmpro."
				+ "gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		
		driver.findElement(By.xpath("//div[@class='ant-space-item'][3]")).click();
				
		driver.quit();
		

	}

}
