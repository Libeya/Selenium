package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		//flipkart
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\'b3wTlE\']")).click();
        driver.findElement(By.xpath
        		("//a[@href='/aw-trend-base-at-store?param=987541&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkZhc2hpb24iXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19']"))
        .click(); 
	
      //  demoQspiders
      
    driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Username:']")).sendKeys("keerthi");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
	driver.findElement(By.xpath("//input[@ type='radio']")).click();
	
	
	//github
	
	driver.get("https://github.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='flex-1']")).click();
	driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium", Keys.ENTER);
	
	
	
	
	}

}
