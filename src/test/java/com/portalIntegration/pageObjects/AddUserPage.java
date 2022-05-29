package com.portalIntegration.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testScripts.BaseClass;

public class AddUserPage {
	
	WebDriver driver;
	
	public AddUserPage(WebDriver remotedriver)
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy (xpath = "//input[@name='FirstName']")
	@CacheLookup
	WebElement txtFirstname;
	
	@FindBy (xpath = "//input[@name='LastName']")
	@CacheLookup
	WebElement txtLastname;
	
	@FindBy (xpath = "//input[@name='Email']")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy (xpath = "//input[@name='ContactNumber']")
	@CacheLookup
	WebElement txtContactNumber;
	
	@FindBy (xpath = "//button[text()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy (xpath = "//button[text()='Reset']")
	@CacheLookup
	WebElement btnReset;
	
	@FindBy (how = How.XPATH, using ="//a[@id='navbarDropdownMenuLink']")
	@CacheLookup
	WebElement linkMailID;
	
	@FindBy (how = How.XPATH, using = "//a[@href='/Account/Logout']")
	@CacheLookup
	WebElement linkLogOut;
	
	@FindBy (xpath ="//div[@class = 'sweet-alert  showSweetAlert visible']")
	@CacheLookup
	WebElement popup;
	
	@FindBy (xpath = "//button[@class ='confirm btn btn-lg btn-primary']")
	@CacheLookup
	WebElement popupOkbtn;
	
	public void popupWindow()
	{
		popup.isSelected();
	}
	
	public void popupOkbtn()
	{
		popupOkbtn.click();
	}
	
	
	public void firstName(String fn) 
	{
		txtFirstname.sendKeys(fn);
		}
	
	public void lastName(String ln) 
	{
		txtLastname.sendKeys(ln);
		
	}

	public void email(String em) 
	{
		txtEmailId.sendKeys(em);
		}

	public void contactNumber(String no) 
	{
		txtContactNumber.sendKeys(no);
	}

	public void clickSubmit() 
	{
		btnSubmit.click();
	}

	public void clickReset() 
	{
		btnReset.click();
	}
	
	public void clickMail()
	{
		linkMailID.click();
	}

	public void ClickLogOut()
	{
		linkLogOut.click();
	}


}

