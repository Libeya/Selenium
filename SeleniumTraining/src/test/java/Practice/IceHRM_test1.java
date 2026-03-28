package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IceHRM_test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://icehrmpro.gamonoid.com/login.php");
			
		driver.findElement(By.id("username")).sendKeys("Admin123");
		driver.findElement(By.id("password")).sendKeys("admin2");
		driver.findElement(By.xpath("//button[@onclick='submitLogin();return false;']")).click();
		
		WebElement Alert = driver.findElement(By.xpath("//div[@class = 'alert alert-danger']"));
		
		if(Alert.isDisplayed()) {
			System.out.println("Alert Passed");
		} else {
			System.out.println("Alert Failed");
		}
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@onclick='submitLogin();return false;']")).click();
		
		WebElement Home_Page = driver.findElement(By.xpath("//header [@id = 'delegationDiv' and @class = 'header']"));
		if(Home_Page.isDisplayed()) {
			System.out.println("Home Page Passed");
		} else {
			System.out.println("Home Page Failed");
		}
		
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.xpath("//a[@href='https://icehrmpro."
				+ "gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		driver.findElement(By.xpath("//a[ @id = 'tabEmployeeSkill']")).click();
		
		driver.findElement(By.xpath("(//div[@class = 'ant-space-item']/child::button)[4]")).click();
		driver.findElement(By.xpath("//button[@aria-label=\'Close\']")).click();
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
		driver.quit();



	}

}
