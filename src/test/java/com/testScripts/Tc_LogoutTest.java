package com.testScripts;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;

public class Tc_LogoutTest extends BaseClass {

	@Test
	
	public void cancelButton() throws Exception {
	
	try {	
	driver.get(baseURL);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LoginPage lp=new LoginPage(driver);
	String url=driver.getCurrentUrl();
	lp.setUserName(Username1);
	lp.setPassword(Password1);
	lp.rememberMe();
	lp.clickCancel();
	Thread.sleep(3000);
	if (url.equals(baseURL)) 
	{
		System.out.println("Test Passed");
	}else 
	{
		System.out.println("Test Failed");
	
	}
	}
	catch(Exception e) {
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\LoginTest2.png"));
	}
	}
}
