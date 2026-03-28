
package com.demo.seleniumgrid.launching_browser;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingChrome {
	
	public static void main(String[]args) throws Exception

	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.210:4444"), options);
		  
		//navigating to an application
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		
	}
}
