package com.testScripts;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;

public class Tc_HomePageManageUser extends BaseClass {
	
	@Test
	public void homePage() throws Exception{
		try {
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		lp.setPassword(Password);
		lp.clickLogin();
		Thread.sleep(2000);
		System.out.println("Print Home page Url: "+ driver.getCurrentUrl());
		Thread.sleep(2000);	
		HomepageHeader he=new HomepageHeader(driver);
		he.clickManageUser();
		he.clickMail();
		Thread.sleep(2000);
		he.ClickLogOut();
		Thread.sleep(2000);		
		}catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	
	
	}
}
