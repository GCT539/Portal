package com.testScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_ManageUserPage_2 extends BaseClass{
	@Test
	
	public void addUserFunction() throws IOException {
		
		try {
			driver.get(baseURL);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Launch the Browser");
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(Username);
			lp.setPassword(Password);
			lp.clickLogin();
			HomepageHeader he=new HomepageHeader(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			ManageUserPage me=new ManageUserPage(driver);
			me.clickManageUser();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			me.clickDeleteBtn();
			me.popupCancelbtn();
			Thread.sleep(3000);
			me.clickAddUser();
			Thread.sleep(2000);
			driver.navigate().back();
			he.ClickLogoButton();
			Thread.sleep(2000);
			he.clickManageUser();
			Thread.sleep(2000);
			me.clickMail();
			me.ClickLogOut();
			System.out.println("Print the url: "+ driver.getCurrentUrl());
			System.out.println("Print Title of the web page: "+ driver.getTitle());
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);										
		}catch(Exception e)
		{
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\ManageUserTest.png"));
		}	
	
	}
}
