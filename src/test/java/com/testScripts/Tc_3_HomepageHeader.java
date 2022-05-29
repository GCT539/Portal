package com.testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;



public class Tc_3_HomepageHeader extends BaseClass {
	
	@Test
	
	public void Link1()  throws Exception{
		
		try {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(Username);
		lp.setPassword(Password);
		lp.clickLogin();
		HomepageHeader he=new HomepageHeader(driver);
		ManageUserPage me=new ManageUserPage(driver);
		he.clickManageUser();
		Thread.sleep(2000);
		//driver.navigate().back();
		he.clickTaskOrder();
		Thread.sleep(2000);
		
		he.clickPrimeContractor();
		Thread.sleep(2000);
		
		he.clickOrganizations();
		Thread.sleep(2000);
		
		he.clickContractNumber();
		Thread.sleep(2000);
		
		he.clickProject();
		Thread.sleep(2000);
		
		he.clickManageCOR();
		Thread.sleep(2000);
		he.clickLogoSymbel();
		Thread.sleep(2000);
		me.clickManageUser();
		driver.navigate().refresh();
		he.clickTaskOrder();
		Thread.sleep(2000);
		he.clickMail();
		Thread.sleep(3000);
		he.ClickLogOut();
		}catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
		
	}

}
