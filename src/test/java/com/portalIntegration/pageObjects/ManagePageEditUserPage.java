package com.portalIntegration.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ManagePageEditUserPage {
	
	WebDriver ldriver;
	
	public void editUserPageObj(WebDriver remotedriver)
	{
		ldriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy (xpath = "//*[@xpath = '//tbody/tr[1]/td[5]/a[1]/i[1]']")
	@CacheLookup
	WebElement clickEditBtn;
	
	@FindBy (xpath = "//input[@placeholder='First Name']")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy (xpath = "//input[@placeholder='Last Name']")
	@CacheLookup
	WebElement txtLastName;

	@FindBy (xpath= "//input[@placeholder='Email Address']")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy (xpath="//input[@placeholder='Contact Number']")
	@CacheLookup
	WebElement txtContactNumber;
	
	@FindBy (xpath = "//button[text()='Update']")
	@CacheLookup
	WebElement btnUpdate;
	
	@FindBy (xpath = "//button[text()='Reset']")
	@CacheLookup
	WebElement btnReset;
	
	@FindBy (how = How.XPATH, using ="//a[@id='navbarDropdownMenuLink']")
	@CacheLookup
	WebElement linkMailID;
	
	@FindBy (how = How.XPATH, using = "//a[@href='/Account/Logout']")
	@CacheLookup
	WebElement linkLogOut;
	
	public void clickMail()
	{
		linkMailID.click();
	}

	public void ClickLogOut()
	{
		linkLogOut.click();
	}
	
	public void clickEditBtn() 
	{
		clickEditBtn.click();
		clickEditBtn.getText();
	}
	public void setFirstName(String name) 
	{
		txtFirstName.sendKeys();
		txtFirstName.clear();
		txtFirstName.toString();
	}
	
	public void setLastName(String uname) 
	{
		txtLastName.sendKeys();
		txtLastName.clear();
		txtLastName.toString();
	}

	public void setEmail(String uname) 
	{
		txtEmailId.sendKeys(uname);
		txtEmailId.clear();
		txtEmailId.toString();
	}

	public void setContactNumber(String uname) 
	{
		txtContactNumber.sendKeys(uname);
		txtContactNumber.clear();
		txtContactNumber.toString();
	}

	public void clickSubmit() 
	{
		btnUpdate.click();
		btnUpdate.isSelected();
	}

	public void clickReset() 
	{
		btnReset.click();
		btnReset.isSelected();
	}

	
}
