package Locator;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classMethod {
	@Test
public void demo()
{
		 WebDriver driver= new ChromeDriver();
		    driver.get("https://demowebshop.tricentis.com/");
		    driver.findElement(By.className("ico-register")).click();
}

}
