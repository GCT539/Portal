package com.portalIntegration.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testScripts.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver driver;
	
	public LoginPage(WebDriver remotedriver)
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy (id="Username")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy (xpath="//span/a")////a[@href='/home/forgotpassword']
	@CacheLookup
	WebElement forgotPwd;
	
	@FindBy (id="Password")
	@CacheLookup
	WebElement txtPassword;
	 
	@FindBy (xpath="//button[@name='button'][@value='login']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy (xpath="//button[@name='button'][@value='cancel']")
	@CacheLookup
	WebElement btnCancel;
	
	@FindBy (id="RememberLogin")
	@CacheLookup
	WebElement btnRememberMe;
	
	@FindBy (xpath ="//a[@id='navbarDropdownMenuLink']")
	@CacheLookup
	WebElement linkMailID;
	
	@FindBy (xpath = "//a[@href='/Account/Logout']")
	@CacheLookup
	WebElement linkLogOut;
	
	public void loginApplication() 
	{
		driver.navigate().to(baseURL);
		System.out.println("portal integration application open ");
		System.out.println("print the url: "+driver.getCurrentUrl());
		txtUsername.sendKeys(Username);
		txtPassword.sendKeys(Password);
		btnLogin.click();
		System.out.println("Portal integration is opened");
		
	}
	
	public void forgotPassword() 
	{
		forgotPwd.click();
		System.out.println("Print url :" +driver.getCurrentUrl());
	}
	
	public void logoutApplications() 
	{
		linkMailID.isSelected();
		linkLogOut.click();
	}
	public void setUserName(String uname) 
	{
		txtUsername.sendKeys(uname);
		System.out.println("Username entered");
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		System.out.println("password entered");
	}
	
	public void clickLogin() 
	{
		btnLogin.click();
		System.out.println("login credentials entered");
	}
	
	public void clickCancel() 
	{
		btnCancel.click();
		System.out.println("cancel button selected");
	}
	
	public void rememberMe()
	{
		btnRememberMe.click();
		System.out.println("optional button to enter all the username and password details after");
	}
	
	public void mail()
	{
		linkMailID.click();
		System.out.println("Select user MailId");
	}

	public void logOut()
	{
		linkLogOut.click();
		System.out.println("Select logout option to logout the apllication");
	}
	
}
