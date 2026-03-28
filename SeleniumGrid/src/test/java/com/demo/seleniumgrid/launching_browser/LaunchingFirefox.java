package com.demo.seleniumgrid.launching_browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingFirefox {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.210:4444"), options);
		  
		//navigating to an application
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);

	}

}
