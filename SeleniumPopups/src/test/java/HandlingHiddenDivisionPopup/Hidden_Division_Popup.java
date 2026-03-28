package HandlingHiddenDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		
		
		WebDriver driver= new ChromeDriver(Options);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//span[@class='ng-tns-c69-9 ui-calendar']")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c69-9']/following::a[.='30']")).click();
		
		
		//driver.findElement(By.xpath("//a[.='11']")).click();
	}

}
