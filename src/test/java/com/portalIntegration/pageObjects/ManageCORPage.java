package com.portalIntegration.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageCORPage {
WebDriver driver;
	
	public ManageCORPage(WebDriver remotedriver) 
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy (how = How.XPATH, using ="//a[contains(@href,'ManageCOR')]")
	@CacheLookup
	WebElement linkManageCOR;
	
	@FindBy (xpath="//input[@id='CORName']")
	@CacheLookup
	WebElement enterCORName;
	
	@FindBy (xpath="//input[@id='BtnSubmit']")
	@CacheLookup
	WebElement btnAdd;
	
	@FindBy (xpath="//input[@id='CancelButton']")
	@CacheLookup
	WebElement btnCancel;
	
	@FindBy (xpath="//select[@name='table_id_length']")
	@CacheLookup
	WebElement showEntries;
	
	@FindBy (xpath="//input[@aria-controls='table_id']")
	@CacheLookup
	WebElement searchProject;
	
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
	
	@FindBy (xpath ="//div[@class = 'sweet-alert  showSweetAlert visible']")
	@CacheLookup
	WebElement popup;
	
	@FindBy (xpath = "//button[@class ='confirm btn btn-lg btn-primary']")
	@CacheLookup
	WebElement popupOkbtn;
	
	@FindBy (xpath ="//button[@class='confirm btn btn-lg btn-danger']")
	@CacheLookup
	WebElement popupYesDeleteitButton;
	
	@FindBy (xpath = "//button[@class='cancel btn btn-lg btn-default']")
	@CacheLookup
	WebElement popupCancelButton;

	@FindBy (xpath="//input[@id='BtnSubmit']")
	@CacheLookup
	WebElement btnUpdate;	
	
	@FindBy (xpath="//table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement webTable;
	
	public void webTable() 
	{
		webTable.getText();
		System.out.println("Pritn the data: " +webTable.getText());
	}
	public void updateBtn() 
	{
		btnUpdate.click();
		System.out.println("select update button");
	}
		
	public void popupWindow()
	{
		popup.isSelected();
		System.out.println("popup window opened");
	}
	
	public void popupOkbtn()
	{
		popupOkbtn.click();
		System.out.println("Accept ok button");
	}	
	
	public void popupDeletebtn()
	{
		popupYesDeleteitButton.click();
		System.out.println("accept delete button");
	}
	
	public void popupCancelbtn()
	{
		popupCancelButton.click();
		System.out.println("select cancel option");
	}
	
	public void clickMail()
	{
		linkMailID.click();
		System.out.println("select mail id");
	}	

	public void ClickLogOut()
	{
		linkLogOut.click();
		System.out.println("select logout option");
	}
	
	public void clickManageCOR()
	{
		linkManageCOR.click();
		linkManageCOR.isSelected();
		linkManageCOR.isEnabled();
		System.out.println("print link name: "+ linkManageCOR.getText());
		System.out.println("select ManageCOR page ");
		
	}

	public void enterManageCOR(String text) 
	{
		enterCORName.sendKeys(text);
		enterCORName.isSelected();
	}

	public void clickAddbtn()
	{
		btnAdd.click();
		btnAdd.isEnabled();
		btnAdd.isSelected();
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
		btnDelete.isEnabled();
	}
	
	public void showEntries()
	{
		WebElement linkshowEntriesOpt=driver.findElement(By.xpath("//select[contains(@name, 'table_id_length')]"));
		Select drop=new Select(linkshowEntriesOpt);
		drop.selectByIndex(1);
		txtShowEntries.isEnabled();
		
	}




}
