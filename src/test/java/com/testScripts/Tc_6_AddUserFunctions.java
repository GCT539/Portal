package com.testScripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.AddUserPage;
import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_6_AddUserFunctions extends BaseClass{
	@Test (invocationCount = 1)
	
	public void addUserPage() throws Exception{

		try {
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		System.out.println("Print Home page Url: "+ driver.getCurrentUrl());
		lp.setUserName(Username);
		lp.setPassword(Password);
		lp.clickLogin();
		System.out.println("Print Home page Url: "+ driver.getCurrentUrl());		
		HomepageHeader he=new HomepageHeader(driver);
		ManageUserPage me=new ManageUserPage(driver);
		AddUserPage ae=new AddUserPage(driver);
		he.clickManageUser();
		System.out.println("Print Home page Url: "+ driver.getCurrentUrl());
		me.clickAddUser();
		System.out.println("Print Home page Url: "+ driver.getCurrentUrl());
		ae.firstName(first());
		Thread.sleep(2000);
		ae.lastName(last());
		Thread.sleep(2000);
		ae.email(em);
		Thread.sleep(2000);
		ae.contactNumber(no);
		ae.clickSubmit();
		Thread.sleep(5000);
		ae.popupWindow();
		ae.popupOkbtn();
		System.out.println("User details created");	
		//driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		System.out.println("Add User will be entered");
		driver.navigate().back();
		Thread.sleep(3000);
		me.clickManageUser();
		me.clickMail();
		me.ClickLogOut();
		}
		catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	}
	
	
	
	
	
	
	public String randomeEmail() 
	{
		String generateEmail=RandomStringUtils.randomAlphabetic(5);
		return(generateEmail);
	}
	public String randomeNumber() 
	{
		String generateNum=RandomStringUtils.randomNumeric(10);
		return(generateNum);
	}
		
}
