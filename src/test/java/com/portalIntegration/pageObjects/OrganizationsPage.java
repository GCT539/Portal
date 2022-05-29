package com.portalIntegration.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

	WebDriver driver;
	
	public OrganizationsPage (WebDriver remotedriver) 
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}

	@FindBy (how = How.XPATH, using ="//a[@class = 'nav-link'][contains(@href,'Organizations')]")
	@CacheLookup
	WebElement linkOrganizations;
	
	@FindBy (xpath="//input[@id='OrganisationName']")
	@CacheLookup
	WebElement enterOrganisationName;
	
	@FindBy (xpath="//input[@id='BtnSubmit']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy (xpath="//input[@id='CancelButton']")
	@CacheLookup
	WebElement btnCancel;
	
	@FindBy (xpath="//select[@name='table_id_length']")
	@CacheLookup
	WebElement showEntries;
	
	@FindBy (xpath="//input[@aria-controls='table_id']")
	@CacheLookup
	WebElement searchOrganizations;
	
	@FindBy (xpath="//table/tbody/tr[1]/td[3]/a/i")
	@CacheLookup
	WebElement btnEdit;
	
	@FindBy (xpath="//table/tbody/tr[1]/td[3]/botton/i")
	@CacheLookup
	WebElement btnDelete;
	
	@FindBy (xpath="//li[@id='table_id_previous']")
	@CacheLookup
	WebElement btnPrevious;
	
	@FindBy (xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNext;
	
	@FindBy (xpath="//*[@aria-live='polite']")
	@CacheLookup
	WebElement txtShowEntries;
	
	@FindBy (how = How.XPATH, using ="//a[@id='navbarDropdownMenuLink']")
	@CacheLookup
	WebElement linkMailID;
	
	@FindBy (how = How.XPATH, using = "//a[@href='/Account/Logout']")
	@CacheLookup
	WebElement linkLogOut;
	
	@FindBy (xpath = "//button[@class='confirm btn btn-lg btn-primary']")
	@CacheLookup
	WebElement popupOkButton;
	
	@FindBy (xpath ="//div[@class = 'sweet-alert  showSweetAlert visible']")
	@CacheLookup
	WebElement popup;
	
	@FindBy (xpath ="//button[@class='confirm btn btn-lg btn-danger']")
	@CacheLookup
	WebElement popupYesDeleteitButton;
	
	@FindBy (xpath = "//button[@class='cancel btn btn-lg btn-default']")
	@CacheLookup
	WebElement popupCancelButton;
	
	@FindBy (xpath="//input[@id='BtnSubmit']")
	@CacheLookup
	WebElement btnUpdate;
	
	public void updateBtn() 
	{
		btnUpdate.click();
	}
	
	public void popupWindow()
	{
		popup.isSelected();
	}
	
	public void popupOkbtn()
	{
		popupOkButton.click();
		System.out.println("Task order details will be accepted");
	}
	
	public void popupDeletebtn()
	{
		popupYesDeleteitButton.click();
	}
	
	public void popupCancelbtn()
	{
		popupCancelButton.click();
	}
	
	public void clickMail()
	{
		linkMailID.click();
	}

	public void ClickLogOut()
	{
		linkLogOut.click();
	}
	
	public void clickOrganizations()
	{
		linkOrganizations.click();
		linkOrganizations.isSelected();
		linkOrganizations.isEnabled();
	}

	public void enterOrganisationName(String text) 
	{
		enterOrganisationName.sendKeys(text);
		enterOrganisationName.getText();
	}

	public void clickSubmit()
	{
		btnSubmit.click();
		btnSubmit.isEnabled();
		btnSubmit.isSelected();
	}
	
	public void clickCancel()
	{
		btnCancel.click();
		btnCancel.isEnabled();
		btnCancel.isSelected();
	}

	public void btnPrevious() 
	{
		btnPrevious.click();
		btnPrevious.isSelected();
		btnPrevious.isEnabled();
	}

	public void btnNext()
	{
		btnNext.click();
		btnNext.isSelected();
		btnNext.isEnabled();
	}
	
	public void btnEdit()
	{
		btnEdit.click();
		btnEdit.isSelected();
		btnEdit.isEnabled();
	}
	
	public void btnDelete()
	{
		btnDelete.click();
		btnDelete.isSelected();
		btnDelete.isEnabled();
	}
	
	public void showEntriesTxt()
	{
		System.out.println("print text: "+txtShowEntries.getText());
		txtShowEntries.isDisplayed();
	}


}
