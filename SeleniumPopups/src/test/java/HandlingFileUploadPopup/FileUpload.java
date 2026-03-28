package HandlingFileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");		
		Thread.sleep(2000);
		
		driver.findElement(By.id("resume")).
		sendKeys("C:\\Users\\LIBEYA MARY S\\Downloads\\211422205161- Libeya Mary S - DevOps.pdf");
		Thread.sleep(2000);

	}

}
