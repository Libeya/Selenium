package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(css="[type='submit']")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		
		getPassWord().sendKeys(passWord);
		
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		getLoginBtn().click();
	}
	
	//Business Logic
	
	//Login Action
	
	public void login(String ValidUserName, String ValidPassword)
	{
		setUserName(ValidUserName);
		setPassWord(ValidPassword);
		clickLoginBtn();
	}
	
	

}
