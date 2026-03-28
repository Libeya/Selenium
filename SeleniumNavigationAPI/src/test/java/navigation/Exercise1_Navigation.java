package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1_Navigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//2. Type automation in search TextField
		driver.findElement(By.className("gLFyf")).sendKeys("automation");
		Thread.sleep(2000);
		
		// 3. navigate to amazon and verify the title
		 driver.navigate().to("https://www.amazon.in/");
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 
		 //4. write tools in the search
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tools");
		 
		 //5. refresh the page
		 driver.navigate().refresh();
		 
		 //6.navigate back and verify title
		 driver.navigate().back();
		 System.out.println(driver.getTitle());
		 
	}

}
