package HandlingJavaScriptPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1.navigate to webpage
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);

	}

}
