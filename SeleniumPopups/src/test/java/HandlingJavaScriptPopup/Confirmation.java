package HandlingJavaScriptPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
        
		
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		
	}

}
