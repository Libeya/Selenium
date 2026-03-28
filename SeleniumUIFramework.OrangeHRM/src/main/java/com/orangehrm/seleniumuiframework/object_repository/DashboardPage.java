package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
		//Pim - link navigate
	@FindBy(xpath = "//span[. = 'PIM']")
	private WebElement pim_module;
	
	//logout - drop-down
	@FindBy(className = "oxd-userdropdown-icon")
	private WebElement logout_dropdown;
	
	@FindBy(xpath="//span[.='Recruitment']")
	private WebElement recuitment;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}
	public void setLogoutLink()
	{
		getLogoutLink().click();
	}

	public WebElement getRecuitment() {
		return recuitment;
	}

	public void clickRecuitment() {
		getRecuitment().click();
	}

	//Getters and setters of Pim module
	public WebElement getPim_module() {
		return pim_module;
	}

	public void clickPim_module() {
		getPim_module().click();
	}

	//Getters and setters of Logout_dropdown
	public WebElement getLogout_dropdown() {
		return logout_dropdown;
	}

	public void logout()
	{
	    logout_dropdown.click();   // click dropdown
	    logoutLink.click();        // click logout
	}
}
