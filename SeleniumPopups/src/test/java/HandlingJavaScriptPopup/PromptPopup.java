package HandlingJavaScriptPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
		Thread.sleep(2000);
		
		Alert prompt= driver.switchTo().alert();
		System.out.println(prompt.getText());
		
		prompt.sendKeys("Mary");
		prompt.accept();

	}

}
