package com.portalIntegration.pageObjects;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageUserPage {
WebDriver driver;
	
	public ManageUserPage(WebDriver remotedriver) 
	{
		driver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy (xpath = "//a[contains(@href,'ManageUser')]")
	@CacheLookup
	WebElement linkManageUser;
	
	@FindBy (xpath="//input[@id='BtnSubmit']")
	@CacheLookup
	WebElement btnUpdate;
	
	@FindBy (xpath = "//a[contains(@class, 'nav-link btn-primar')]")
	@CacheLookup
	WebElement linkAddUser;
	
	@FindBy (xpath = "//input[contains(@class, 'form-control form-control-sm')]")
	@CacheLookup
	WebElement searchbar;
	
	/*@FindBy (xpath = "//select[contains(@name, 'table_id_length')]")
	@CacheLookup
	WebElement linkshowEntriesOpt; */
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/a[1]/i[1]")
	@CacheLookup
	WebElement linkEditBtn;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/a[2]/i")
	@CacheLookup
	WebElement linkPermissionBtn;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/botton/i")
	@CacheLookup
	WebElement linkDeleteBtn;
	
	@FindBy (xpath = "//li[@id = 'table_id_previous']")
	@CacheLookup
	WebElement linkPreviousbBtn;
	
	@FindBy (xpath = "//a[text() = 'Next']")
	@CacheLookup
	WebElement linkNextBtn;
	
	@FindBy (xpath = "//*[@id = 'table_id_info']")
	@CacheLookup
	WebElement showEntriesSelectionText;
	
	@FindBy (how = How.XPATH, using ="//a[@id='navbarDropdownMenuLink']")
	@CacheLookup
	WebElement linkMailID;
	
	@FindBy (how = How.XPATH, using = "//a[@href='/Account/Logout']")
	@CacheLookup
	WebElement linkLogOut;
	
	@FindBy (xpath ="//button[@class='confirm btn btn-lg btn-danger']")
	@CacheLookup
	WebElement popupYesDeleteitButton;
	
	@FindBy (xpath = "//button[@class='cancel btn btn-lg btn-default']")
	@CacheLookup
	WebElement popupCancelButton;
	
	@FindBy (xpath = "//div[@class='sweet-alert  showSweetAlert visible']")
	@CacheLookup
	WebElement popUpWindow;
	
	@FindBy (xpath = "//button[@class='confirm btn btn-lg btn-primary']")
	@CacheLookup
	WebElement popupOkButton;

	private Select drop;
	
	public void updateBtn() 
	{
		btnUpdate.click();
	}
	
	public void popup() 
	{
		popUpWindow.isSelected();
	}
	
	public void popupDeletebtn()
	{
		popupYesDeleteitButton.click();
	}
	
	public void popupCancelbtn()
	{
		popupCancelButton.click();
	}
	
	public void popupOkbtn()
	{
		popupOkButton.click();
	}
	
	public void clickMail()
	{
		linkMailID.isEnabled();
		linkMailID.click();
		System.out.println("User mailId selected");
	}

	public void ClickLogOut()
	{
		linkLogOut.click();
		System.out.println("user log out from the application");
	}
	public void clickManageUser() 
	{
		linkManageUser.click();
		System.out.println("Manage user will be selected");
	}
	
	public void showEntries() 
	{
		WebElement linkshowEntriesOpt=driver.findElement(By.xpath("//select[contains(@name, 'table_id_length')]"));
		Select drop=new Select(linkshowEntriesOpt);
		drop.selectByIndex(1);
	
		
	}
	public void clickAddUser() 
	{
		linkAddUser.click();
		System.out.println("Add user page is opened");
	}

//	public void clickShowEntries() 
//	{
//		
//		WebElement linkshowEntriesOpt=driver.findElement(By.xpath("//select[contains(@name, 'table_id_length')]"));
//	}

	public void SelectSearchBar(String text) 
	{
		searchbar.sendKeys(text);
		
	}
	
	public void SelectSearchBar(Scanner scanner) 
	{
		searchbar.sendKeys( );
		
	}
	
	public void clickPreviousBtn() 
	{
		linkPreviousbBtn.isSelected();
		linkPreviousbBtn.click();
		System.out.println("move to previous page");
	}

	public void clickNextBtn() 
	{
		linkNextBtn.isSelected();
		linkNextBtn.click();
		System.out.println("move to next page");
	}

	public void showEntriesselectionText() 
	{
		System.out.println(showEntriesSelectionText.getText());
	}
		
	public void clickDeleteBtn() 
	{
		linkDeleteBtn.click();
		System.out.println("Delete the manage user details");
	}
	
	public void clickEditBtn()
	{
		linkEditBtn.click();
	}
	
	public void clickPermissionBtn() 
	{
		linkPermissionBtn.click();
	}

	}
	
	
	
	


