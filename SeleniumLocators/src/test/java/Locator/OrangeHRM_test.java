package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_test {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'user')]"));
        username.sendKeys("Admin");
		
        WebElement pwd=driver.findElement(By.xpath("//input[starts-with(@name,'pass')]"));
        pwd.sendKeys("admin123");
 
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        driver.findElement(By.linkText("Change Password")).click();
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().refresh();
        
        driver.quit();
        

	}

}











