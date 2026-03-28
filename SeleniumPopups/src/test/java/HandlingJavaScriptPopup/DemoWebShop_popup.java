package HandlingJavaScriptPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1.navigate to webpage
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(
			    ".button-1 search-box-buttonn"
			)).click();
        
        
        
        

	}

}
