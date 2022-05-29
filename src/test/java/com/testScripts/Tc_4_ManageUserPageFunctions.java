package com.testScripts;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_4_ManageUserPageFunctions extends BaseClass{
	
	@Test(invocationCount = 1)
	
	public void ManageUserPageFunctions() throws Exception {
		try {
			LoginPage lp=new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			ManageUserPage me=new ManageUserPage(driver);
			driver.navigate().to(baseURL);
			lp.setUserName(Username);
			lp.setPassword(Password);
			lp.clickLogin();
			Thread.sleep(2000);
			me.clickManageUser();
			Thread.sleep(1000);
			me.showEntries();
			Thread.sleep(2000);
			Scanner text=new Scanner(System.in);
			System.out.println("enter text:");
			String data=text.nextLine(); 
			me.SelectSearchBar(data);
			Thread.sleep(3000);
			me.clickNextBtn();
			Thread.sleep(3000);
			me.clickPreviousBtn();
			Thread.sleep(3000);
			me.clickDeleteBtn();
			me.popupDeletebtn();
			me.popupOkbtn();
			Thread.sleep(3000);
			me.showEntriesselectionText();
			me.clickMail();
			Thread.sleep(2000);
			me.ClickLogOut();
			
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	}
}
