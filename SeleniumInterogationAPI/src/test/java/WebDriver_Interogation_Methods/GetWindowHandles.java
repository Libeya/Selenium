package WebDriver_Interogation_Methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1.navigate to demo workshop
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(9000);
		
		//2. Fetching the window id of the parent window
		 String parentId= driver.getWindowHandle();		
		 System.out.println("The parent window id: "+parentId);
		 
		 //3. click on tab to get the child window popup
		 driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		 Thread.sleep(9000);
		 
		 //4. Fetching the window id's of both parent window and child window
		 Set<String> AllWindowId= driver.getWindowHandles();
		 System.out.println("Window Id of both parent and child: "+AllWindowId);
		 
		 
		 //5.Removing the parent id from AllWindowId
		 AllWindowId.remove(driver.getWindowHandle());
		 
		 //6.return only the child window id as string
		 for(String child:AllWindowId)
		 {
			 System.out.println("The child window Id is: "+child);
		 }
		 Thread.sleep(9000);

	}

}
