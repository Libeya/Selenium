package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnHiddenElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    driver.get("https://www.facebook.com/r.php");
	    
	    //select your gender
	    
	    driver.findElement(By.xpath(""))
	    
	    
	    

	}

}
