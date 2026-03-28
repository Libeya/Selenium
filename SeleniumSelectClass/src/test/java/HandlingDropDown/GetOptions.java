package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
		
		//1. Navigate to WebPage
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//2. Target select
		 Select sel= new Select(driver.findElement(By.id("options")));
		 
		 //3.Fetch all the available options from the drop-down
		 List<WebElement> allOptions=sel.getOptions();
		 
		 //Fetching the name of option available in the drop-down
		 for(WebElement option: allOptions)
		 {
			 System.out.println(option.getText());
		 }
		 
		driver.quit();

	}

}
