package com.orangehrm.seleniumuiframework.buzz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostingPostTest {

	public static void main(String[] args) {
		
		//Launching the browser
		WebDriver driver =new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		//Implict time wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Click login btn
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//Navigate to buzz link
		driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']")).click();
		
		//Enter the textArea content
		String msgPost="Hi How are you..? Welcome to V&V Testing...";
		
		//Navigate to textarea
		driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']")).sendKeys(msgPost);
		
		//Post the content typed
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Verification
		 String recentPost = driver.findElement(
	                By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text'])[1]"))
	                .getText();

	        if (recentPost.contains(msgPost)) {
	            System.out.println("Post successfully displayed in Recent Posts - TEST PASSED");
	        } else {
	            System.out.println("Post not displayed - TEST FAILED");
	        }
		
		//Logout
		driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
        driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		

	}

}
