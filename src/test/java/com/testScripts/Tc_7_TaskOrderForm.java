package com.testScripts;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.TaskOrderPage;

public class Tc_7_TaskOrderForm extends BaseClass{
	@Test
	
	public void taskOrderFunctions() throws Exception{
		try {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.loginApplication();
		HomepageHeader he=new HomepageHeader(driver);
		he.clickTaskOrder();
		Thread.sleep(3000);
		TaskOrderPage to=new TaskOrderPage(driver);
		Thread.sleep(3000);
		to.enterTaskOrder(text);
		to.clickSUbmit();
		to.popupOkbtn();
		Thread.sleep(3000);
		to.clickEdit();
		to.enterTaskOrder(text);
		to.updateBtn();
		to.popupOkbtn();
		to.clickDelete();
		to.popupDeletebtn();
		to.popupOkbtn();
		to.clickMail();
		to.ClickLogOut();
		
		}catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	}
}
