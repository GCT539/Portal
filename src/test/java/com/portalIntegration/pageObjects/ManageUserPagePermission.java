package com.portalIntegration.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ManageUserPagePermission {
	
WebDriver ldriver;
	
	public void editUserPageObj(WebDriver remotedriver)
	{
		ldriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy (xpath = "//*[@xpath = '//tbody/tr[1]/td[5]/a[2]/i[1]']")
	@CacheLookup
	WebElement linkPermissionBtn;
	
	@FindBy (xpath = "//input [@id ='txtFirstName']")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy (xpath = "//input [@id ='txtLastName']")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy (xpath = "//input [@id ='txtEmail']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy (xpath = "//input [@id ='txtContactNumber']")
	@CacheLookup
	WebElement txtContactNumber;
	
	@FindBy (xpath = "//span [@id ='sptext']")
	@CacheLookup
	WebElement assignPortalList;
	
	@FindBy (xpath = "//select [@id = 'ddlportals']")
	@CacheLookup
	WebElement selectPortals;
	
	@FindBy (xpath = "//select [@id = 'ddlroleno']")
	@CacheLookup
	WebElement selectRole;
	
	@FindBy (xpath = "//button [@id = 'portalroleuser']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy (xpath = "//button [text() = 'Reset']")
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
	
	public void inputFirstName()
	{
		txtFirstName.clear();
		txtFirstName.sendKeys();
		txtFirstName.isEnabled();
		txtFirstName.getText();
		txtFirstName.toString();
	}
	
	public void inputLastName()
	{
		txtLastName.clear();
		txtLastName.sendKeys();
		txtLastName.isEnabled();
		txtLastName.getText();
		txtLastName.toString();
	}

	public void inputEmailId()
	{
		txtEmail.clear();
		txtEmail.sendKeys();
		txtEmail.isEnabled();
		txtEmail.getText();
		txtEmail.toString();
	}
	
	public void inputContactNumber()
	{
		txtContactNumber.clear();
		txtContactNumber.sendKeys();
		txtContactNumber.isEnabled();
		txtContactNumber.getText();
		txtContactNumber.toString();
	}
	
	public void selectPortals()
	{
		selectPortals.isEnabled();
		selectPortals.click();
		selectPortals.getText();
		selectPortals.findElements(By.xpath("//select [@id = 'ddlportals'].selectByValue(string)"));
	}
	
	public void selectRole() 
	{
		selectRole.getText();
		selectRole.click();
		selectRole.isEnabled();
	}

	public void clickSubmit()
	{
		btnSubmit.click();
		btnSubmit.isEnabled();
		
	}

	public void clickReset()
	{
		btnReset.click();
		btnReset.isEnabled();
		
	}



}
