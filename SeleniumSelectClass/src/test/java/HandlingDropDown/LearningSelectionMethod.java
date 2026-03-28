package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectionMethod {

	public static void main(String[] args) throws InterruptedException {

				WebDriver driver=new ChromeDriver();
				
				//1. Navigate to WebPage
				driver.get("https://demo.automationtesting.in/Register.html");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				//2. Locating the skills drop-down
				WebElement dropdown = driver.findElement(By.id("Skills"));
				
				//3. Making object of select class
				Select sel= new Select(dropdown);
				
				//4.Calling select method by index
				sel.selectByIndex(9); 
				Thread.sleep(2000);
				
				//5. By Value attribute
				sel.selectByValue("Corel Draw");
				Thread.sleep(2000);
				
				//6. By visible text
				sel.selectByVisibleText("Matlab");
				Thread.sleep(2000);
				
				//7.By contains visible text to click on Javascript
				sel.selectByContainsVisibleText("script");
				Thread.sleep(2000);
				

	}

}
