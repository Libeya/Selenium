package HandlingFileUploadPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_FileUpload {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");		
		driver.findElement(By.partialLinkText("Register")).click();
		
		
		driver.findElement(By.xpath("//div[@data-val='exp']")).click();
	
		
		driver.findElement(By.id("resumeUpload"))
		.sendKeys("C:\\Users\\LIBEYA MARY S\\Downloads\\Panimalar-UG-Project_Report-Format.pdf");
		
		
		
		

	}

}
