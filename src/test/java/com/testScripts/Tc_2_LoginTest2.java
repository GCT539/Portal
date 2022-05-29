package com.testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;

public class Tc_2_LoginTest2 extends BaseClass{

	@Test
	public void invalidData() throws Exception{
		try {
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(Username);
		lp.setPassword(Password1);
		lp.rememberMe();
		lp.clickCancel();
		
		String current=driver.getCurrentUrl();
		if(baseURL.equals(current)){
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
			System.out.println("print current Url: " + current);
			System.out.println("Print Base    Url: "+ baseURL);
		}
		}catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
				
	}
}
