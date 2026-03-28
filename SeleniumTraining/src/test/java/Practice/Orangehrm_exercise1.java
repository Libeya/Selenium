package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_exercise1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n"
				+ "\r\n"
				+ "");
		
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
	String parentWindow = driver.getWindowHandle();
    System.out.println("Parent Window ID: " + parentWindow);

    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
    Set<String> allWindows = driver.getWindowHandles();
    for(String window : allWindows) {
        if(!window.equals(parentWindow)) {
            driver.switchTo().window(window);
            break;
        }
    }
    String url = driver.getCurrentUrl();
    if(url.contains("orangehrm.com")) {
        System.out.println("URL matched successfully");
    }
    String title = driver.getTitle();
    if(!title.isEmpty()) {
        System.out.println("Title Validated successfully");
    }
    driver.close();
    driver.switchTo().window(parentWindow);

    if(driver.findElement(By.name("username")).isDisplayed()) {
        System.out.println("Login Page is displayed");
    }
    driver.quit();
	
	
	
    

	
	    

	}

}
