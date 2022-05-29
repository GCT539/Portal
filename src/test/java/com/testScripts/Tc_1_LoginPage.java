package com.testScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;

public class Tc_1_LoginPage extends BaseClass{
	@Test
	public void loginButton() throws Exception {
		try {
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		Thread.sleep(3000);
		System.out.println("Enter the Username:"+ Username);
		lp.setPassword(Password);
		System.out.println("Enter the Password:"+ Password);
		lp.rememberMe();
		String title=driver.getTitle();
		Assert.assertNull(title);
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl, baseURL);
		System.out.println("print currrent Url:" + currenturl);
		System.out.println("print currrent Url:" + baseURL);
		
		}catch (Exception e)
		{
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	}	
}
	
		

