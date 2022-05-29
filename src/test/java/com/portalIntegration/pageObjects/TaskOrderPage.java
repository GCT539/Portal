package com.portalIntegration.pageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskOrderPage {
	
WebDriver driver;
	
	public TaskOrderPage(WebDriver remotedriver)
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
		
	@FindBy (xpath="//input[@id='TaskOrderId']")
	@CacheLookup
	WebElement taskOrderForm;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href,'TaskOrder')]")
	@CacheLookup
	WebElement linkTaskOrder;
	
	@FindBy (xpath="//input[@value='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy (xpath="//input[@id='BtnSubmit']")
	@CacheLookup
	WebElement btnUpdate;
	
	@FindBy (xpath="//input[@value='Cancel']")
	@CacheLookup
	WebElement btnCancel;
	
	@FindBy (xpath="//select[@aria-controls='table_id']")
	@CacheLookup
	WebElement showEntries;
	
	@FindBy (xpath="//input[@aria-controls='table_id']")
	@CacheLookup
	WebElement searchBar;

	@FindBy (xpath="//table/tbody/tr[1]/td[3]/a/i")
	@CacheLookup
	WebElement btnEdit;
	
	@FindBy (xpath="//table/tbody/tr[1]/td[3]/botton/i")
	@CacheLookup
	WebElement btnDelete;
	
	@FindBy (xpath="//li[@id='table_id_previous']")
	@CacheLookup
	WebElement btnPrevious;
	
	@FindBy (xpath="//a[@aria-controls='table_id'][text()='Next']")
	@CacheLookup
	WebElement btnNext;

	@FindBy (xpath="//div[@aria-live='polite']")
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
	
	public void updateBtn() 
	{
		btnUpdate.click();
	}
	
	
	public void popupWindow()
	{
		popup.isSelected();
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
	
	public void selectTaskOrder()
	{
		linkTaskOrder.click();
	}
	
	public void enterTaskOrder(String text)
	{
		String s=taskOrderForm.getText();
		System.out.println(s);
		taskOrderForm.isEnabled();
		System.out.println("Task order form selected");
		taskOrderForm.sendKeys(text);
	}
	
	public void popupOkbtn()
	{
		popupOkButton.click();
		System.out.println("Task order details will be accepted");
	}
	
	public void clickSUbmit() 
	{
		//btnSubmit.isEnabled();
		btnSubmit.click();
		System.out.println("New Task order details submitted");
	}
	
	public void clickCancel() 
	{
		btnCancel.click();
//		btnCancel.isSelected();
//		btnCancel.isEnabled();
		System.out.println("Cancel the task order creation");
	}

	public void showEntries() 
	{
		WebElement linkshowEntriesOpt=driver.findElement(By.xpath("//select[contains(@name, 'table_id_length')]"));
		Select drop=new Select(linkshowEntriesOpt);
		drop.selectByIndex(1);
	}
	
	public void txtSearchBar() 
	{
		searchBar.sendKeys();
//		searchBar.clear();
//		searchBar.toString();
	}

	public void btnPrevious() 
	{
		btnPrevious.click();
//		btnPrevious.isSelected();
		btnPrevious.isEnabled();
	}

	public void btnNext() 
	{
		btnNext.click();
//		btnNext.isSelected();
		btnNext.isEnabled();
	}

	public void txtShowEntries() 
	{
		txtShowEntries.getText();
		txtShowEntries.isDisplayed();
	}
	
	public void clickEdit()
	{
		btnEdit.click();
		btnEdit.clear();
		btnEdit.isSelected();
	}
	
	public void clickDelete() 
	{
		btnDelete.click();
		btnDelete.isSelected();
	}	

	
}
