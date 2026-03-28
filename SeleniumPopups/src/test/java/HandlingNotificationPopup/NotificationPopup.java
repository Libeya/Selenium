package HandlingNotificationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		// Disable chrome notifications
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		// Launch the browser
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		// Navigate to URL
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);

		// Click on the notification button
		driver.findElement(By.id("browNotButton")).click();

	}

}
