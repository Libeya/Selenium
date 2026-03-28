package com.demo.seleniumgrid.launching_browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingEdge {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("headless");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.210:4444"), options);
		  
		//navigating to an application
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);

	}

}
