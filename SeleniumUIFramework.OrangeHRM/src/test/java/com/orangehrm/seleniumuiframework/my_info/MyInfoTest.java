package com.orangehrm.seleniumuiframework.my_info;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class MyInfoTest {
@Test
	public void login() throws InterruptedException {
		
		     //Launching the browser
				WebDriver driver =new ChromeDriver();
				
				// maximize the window
				driver.manage().window().maximize();
				
				//Implicit time wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Navigate to Website
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//Username
				driver.findElement(By.name("username")).sendKeys("Admin");
				
				//Password
				driver.findElement(By.name("password")).sendKeys("admin123");
				
				//Click login btn
				driver.findElement(By.cssSelector("[type='submit']")).click();

				//Navigate to MyInfo
				driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
				
				
				
				//Storing the First Name
				WebElement first_name=driver.findElement(By.name("firstName"));
				Thread.sleep(1000);
				first_name.sendKeys(Keys.CONTROL+ "a");
				first_name.sendKeys(Keys.CONTROL+"a");
				Thread.sleep(1000);
				first_name.sendKeys("Mary");
				
				//Storing the Last Name
				WebElement last_name=driver.findElement(By.name("lastName"));
				Thread.sleep(1000);
				last_name.sendKeys(Keys.CONTROL+ "a");
				last_name.sendKeys(Keys.CONTROL+"a");
				Thread.sleep(1000);
				last_name.sendKeys("Preci");
								
				//Storing the employee id
				WebElement emp_id = driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]"));
				Thread.sleep(1000);
				emp_id.sendKeys(Keys.CONTROL+ "a");
				emp_id.sendKeys(Keys.CONTROL+"a");
				Thread.sleep(1000);
				emp_id.sendKeys("5123");
				
				//Saving the changes
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
				//Logout
				driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
		        driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		        
		        //Then login again
		      //Username
				driver.findElement(By.name("username")).sendKeys("Admin");
				
				//Password
				driver.findElement(By.name("password")).sendKeys("admin123");
				
				//Click login btn
				driver.findElement(By.cssSelector("[type='submit']")).click();
				
				//Navigate to MyInfo
				driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
				
				 // Verification
		        String newFirstName = driver.findElement(By.name("firstName")).getAttribute("value");
		        String newLastName = driver.findElement(By.name("lastName")).getAttribute("value");
		        String newEmpId = driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]"))
		                .getAttribute("value");

		        if(newFirstName.equals("Mary") && newLastName.equals("Preci") && newEmpId.equals("5123"))
		        {
		            System.out.println("Employee details updated successfully - TEST PASSED");
		        }
		        else
		        {
		            System.out.println("Employee details not updated - TEST FAILED");
		        }

		      //Logout
				driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
		        driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();

		        driver.quit();
				
				
	}

}
