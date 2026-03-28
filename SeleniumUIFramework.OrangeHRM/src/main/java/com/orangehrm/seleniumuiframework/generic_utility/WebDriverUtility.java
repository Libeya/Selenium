package com.orangehrm.seleniumuiframework.generic_utility;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public WebDriverUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//1.manage
	
	//1.1maximize
	public void configMaximizedBrowser()
	{
		driver.manage().window().maximize();
	}
	
	//1.2minimize
	public void configMinimizedBrowser()
	{
		driver.manage().window().minimize();;
	}
	
	//1.3FullScreen
	public void configFullscreenBrowser()
	{
		driver.manage().window().fullscreen();
	}
	
	//1.4Fetch Size
	public Dimension fetchSize()
	{
		Dimension dimension= driver.manage().window().getSize();
		return null;
	}
	
	//1.5Set Size
	public void configBrowserSize(int width,  int height) 
	{
		driver.manage().window().setSize(new Dimension(width,height));
	}
	
	//1.6 Set Position
	public void configBrowserCoordinates(int x, int y)
	{
		driver.manage().window().setPosition(new Point(x,y));
	}
	
		
	//2.Navigate
	
	//2.1 Navigate To
	
	public void navigateToApplication(String fullUrl)
	{
		driver.navigate().to(fullUrl);
	}
	
	//2.2 Forward
	public void navigateForward()
	{
		driver.navigate().forward();
	}
	
	//2.3 Backward
		public void navigateBackward()
		{
			driver.navigate().back();;
		}
		
    //2.4 Refresh
		public void refreshCurrentPage()
		{
			driver.navigate().refresh();
		}
		
    //2.5 Get
				public void enterUrl(String url)
				{
					driver.get(url);
				}
				
	//2.6 Get Title
				public String fetchApplicationTitle()
				{
					String title = driver.getTitle();
					return title;
				}
				
	//2.7 Get Current Url
				public String fetchApplicationUrl()
				{
					String url = driver.getCurrentUrl();
					return url;
				}
				
	//2.8 Close 
				public void closingBrowserTab()
				{
					driver.close();
				}
				
	//2.9 Quit 
				public void closingBrowserWindow()
				{
					driver.quit();
				}	
				
				
	//3.Timeouts
	
	public void waitForElementsToLoad(long timeInSeconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	
	//4. Explicit Wait
	
	//4.1 Click-able
	
	public void waitTillTheElementsIsClickable(WebElement element, long maximumTimeToWait)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//4.2 Visible
	
	public void waitTillTheElementsIsVisible(WebElement element, long maximumTimeToWait)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	//5.pop-ups
	
	//5.1 Accept
	public void clickOnAccept()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//5.2 Dismiss
	public void clickOnDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//5.3 Type in JS pop-up
	public void typeMessageInJavaScriptPopup(String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	//5.4 Print JS pop-up
	public String fetchJavaScriptPopupMessage()
	{
		String message= driver.switchTo().alert().getText();
		return message;
	}
	
	// Child Window Switching By Title
	
	public void windowSwitchingByTitle(String childApplicationTitle) {
	    String parentId=driver.getWindowHandle();
	    Set<String>childIds=driver.getWindowHandles();
	    childIds.remove(parentId);
	    for(String child:childIds) {
	    driver.switchTo().window(child);
	    String title=driver.getTitle();
	    if(title.contains(childApplicationTitle)) {
	    break;
	    }
	  }
	}
	
	// Child Window Switching By Url
	
	 public void windowSwitchingbyUrl(String childApplicationTitle) {
		    String parentId=driver.getWindowHandle();
		    Set<String>childIds=driver.getWindowHandles();
		    childIds.remove(parentId);
		    for(String child:childIds) {
		    driver.switchTo().window(child);
		    String title=driver.getCurrentUrl();
		    if(title.contains(childApplicationTitle)) {
		    break;
		    }
		    }
		   
		    }
	
	
	
	//6. iFrame
	public void switchToFrameByIndex(int indexNo)
	{
		driver.switchTo().frame(indexNo);
	}
	
	public void switchToFrameByIdOrName(String idOrNameValue)
	{
		driver.switchTo().frame(idOrNameValue);
	}
	
	public void switchToFrameByFrameElement(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	public void switchBackTheControlToPreviousFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public void switchBackTheControlToMainPage()
	{
		driver.switchTo().defaultContent();
	}
	

}
