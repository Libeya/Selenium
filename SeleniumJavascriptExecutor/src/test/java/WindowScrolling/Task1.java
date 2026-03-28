package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				// Navigate to Demo Web Shop
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(3000);

				// Locate search text field
				WebElement search = driver.findElement(By.id("small-searchterms"));

				// Type "Mobile" using JavaScriptExecutor
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value='Mobiles'", search);

	}

}
