package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_exercise2 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		WebElement drop = driver.findElement(By.xpath("(//div[@class='oxd-select-text'])[1]"));
		
		drop.click();
		Thread.sleep(5000);
		drop.sendKeys(Keys.ARROW_DOWN);
		drop.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		String role = drop.getText();

		if(role.equals("Admin")) {
		    System.out.println("Admin selected successfully");
		}
		drop.click();
		 drop.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		 drop.sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		 
		 String role2 = drop.getText();

			if(role2.equals("ESS")) {
			    System.out.println("ESS selected successfully");
			}
			
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
			 driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			 driver.findElement(By.partialLinkText("Logout")).click();
		
       driver.quit();
	}

}
