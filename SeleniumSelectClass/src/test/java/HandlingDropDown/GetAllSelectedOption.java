package HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver();
		
		//1. Navigate to WebPage
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement listbox= driver.findElement(By.id("cars"));
		Select sel= new Select(listbox);
		
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Volvo");
		
		List<WebElement> allOptions=sel.getAllSelectedOptions();
		for(WebElement s: allOptions)
		{
			System.out.println(s.getText());
		}
		
		driver.quit();
	}
	

}
