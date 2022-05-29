package com.portalIntegration.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testScripts.BaseClass;

public class HomepageHeader {
	
	WebDriver driver;
	
	public HomepageHeader(WebDriver remotedriver) 
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}


	BaseClass b=new BaseClass();
	
	@FindBy (how = How.XPATH, using ="//img[@class ='icon-banner']")
	@CacheLookup
	WebElement logoButton;
	
	@FindBy (how = How.XPATH, using= "//a[contains(@href,'ManageUser')]")
	@CacheLookup
	WebElement linkManageUser;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href,'TaskOrder')]")
	@CacheLookup
	WebElement linkTaskOrder;

	@FindBy (how = How.XPATH, using ="//a[@class = 'nav-link'][contains(@href,'PrimeContractor')]")
	@CacheLookup
	WebElement linkPrimeContractor;
	
	@FindBy (how = How.XPATH, using ="//a[@class = 'nav-link'][contains(@href,'Organizations')]")
	@CacheLookup
	WebElement linkOrganizations;
	
	@FindBy (how = How.XPATH, using ="//a[contains(@href,'ContractNumber')]")
	@CacheLookup
	WebElement linkContrctNumber;
	
	@FindBy (how = How.XPATH, using ="//a[contains(@href,'Project')]")
	@CacheLookup
	WebElement linkProject;
	
	@FindBy (how = How.XPATH, using ="//a[contains(@href,'ManageCOR')]")
	@CacheLookup
	WebElement linkManageCOR;
	
	@FindBy (how = How.XPATH, using ="//a[@id='navbarDropdownMenuLink']")
	@CacheLookup
	WebElement linkMailID;
	
	@FindBy (how = How.XPATH, using = "//a[@href='/Account/Logout']")
	@CacheLookup
	WebElement linkLogOut;
	
	
	
	public void clickLogoSymbel() 
	{
		logoButton.click();
		System.out.println("Home button logo will be selected ");
		System.out.println("portal page is opened");
	}

	public void clickManageUser()
	{
		linkManageUser.click();
		System.out.println("Manage User page is opened");
		System.out.println("ManageUser page Url: " + driver.getCurrentUrl());
	}
	
	public void clickTaskOrder()
	{
		linkTaskOrder.click();
		System.out.println("Task order page is opened");
		System.out.println("TaskORder page Url: " + driver.getCurrentUrl());
	}
	
	public void clickPrimeContractor()
	{
		linkPrimeContractor.click();
		System.out.println("Prime Contractor page is opened");
		System.out.println("PrimeContractor page Url: " + driver.getCurrentUrl());
	}

	public void clickOrganizations()
	{
		linkOrganizations.click();
		System.out.println("organization page is opened");
		System.out.println("Organization page Url: " + driver.getCurrentUrl());
	}

	public void clickContractNumber()
	{
		linkContrctNumber.click();
		System.out.println("Contract number page is opened");
		System.out.println("Contract number page Url: " + driver.getCurrentUrl());
	}
	
	public void clickProject()
	{
		linkProject.click();
		System.out.println("Porject page is opened");
		System.out.println("Project page Url: " + driver.getCurrentUrl());
	}

	public void clickManageCOR()
	{
		linkManageCOR.click();
		System.out.println("Manage COR page is selected");
		System.out.println("ManageCOR page Url: " + driver.getCurrentUrl());
	}
	
	public void ClickLogoButton() 
	{
		logoButton.click();
		System.out.println("Enter home page of portal integration");
		//System.out.println("get title of the home page: "+ driver.getTitle());
	}

	public void clickMail()
	{
		linkMailID.isEnabled();
		linkMailID.click();
		System.out.println("User maild id selected ");
	}

	public void ClickLogOut()
	{
		linkLogOut.click();
		System.out.println("User Logout of the application");
		
	}

}
