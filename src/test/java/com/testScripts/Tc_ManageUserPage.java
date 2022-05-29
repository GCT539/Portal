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

public class Tc_ManageUserPage extends BaseClass{
	
	@Test
	
	public void manageUserFunctions() throws IOException {
		
		try {
			driver.get(baseURL);
			driver.manage().window().maximize();
			System.out.println("Launch the Browser");
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(Username);
			lp.setPassword(Password);
			lp.clickLogin();
			HomepageHeader he=new HomepageHeader(driver);
			he.clickManageUser();
			he.clickLogoSymbel();
			System.out.println("Print the url:" + driver.getCurrentUrl());
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		}catch(Exception e)
		{
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\ManageUserTest.png"));
			}
		}
		
	
		

}
