package com.testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;



public class Tc_ForgotPassword extends BaseClass{

	@Test
	
	public void forgotPassword() throws Exception{
		try {
		driver.get(baseURL);
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(Username);
		lp.rememberMe();
		Thread.sleep(2000);
		lp.forgotPassword();
		String currenturl=driver.getCurrentUrl();
		String fpwdUrl="https://portalintegration.graycelltech.net/home/forgotpassword";
		Thread.sleep(3000);
		Assert.assertEquals(currenturl, fpwdUrl);
		}catch(Exception e)
		{
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\ManageUserTest.png"));
			}
		
		
	}

}
