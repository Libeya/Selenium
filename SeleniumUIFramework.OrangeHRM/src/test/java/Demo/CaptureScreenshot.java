package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class CaptureScreenshot

{@Test(invocationCount = 2)
     public void screenshot() throws InterruptedException, IOException
     {
    	 WebDriver driver = new ChromeDriver();
    	 WebDriverUtility wu= new WebDriverUtility(driver);
    	 LoginPage lp= new LoginPage(driver);
    	 DashboardPage dsp = new DashboardPage(driver);
    	 
    	 //Creating a method for time-stamp
    	 
    	 String Timestamp=new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
    	 
    	 wu.configMaximizedBrowser();
    	 wu.waitForElementsToLoad(20);
    	 wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 lp.login("Admin", "admin123");
    	 Thread.sleep(5000);
    	 
    	 //Capture the screenshot of Home page
    	 TakesScreenshot ts = (TakesScreenshot) driver;
    	 File temp=ts.getScreenshotAs(OutputType.FILE);
    	 File perm = new File("./Reports/dashboard"+Timestamp+".png");
    	 FileHandler.copy(temp, perm);
    	 
    	 //Capture the screenshot of web element
    	 WebElement recruitmentLink= dsp.getRecuitment();
    	 File tempsrc=recruitmentLink.getScreenshotAs(OutputType.FILE);
    	 File permTrg= new File("./Reports/recruitmentlink"+Timestamp+".png");
    	 FileHandler.copy(tempsrc, permTrg);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
