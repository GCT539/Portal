package com.testScripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.OrganizationsPage;
import com.portalIntegration.pageObjects.TaskOrderPage;

public class Tc_9_OrganizationPage extends BaseClass{
@Test
	
	public void taskOrderFunctions() throws Exception{
		try {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.loginApplication();
		HomepageHeader he=new HomepageHeader(driver);
		he.clickOrganizations();
		Thread.sleep(3000);
		OrganizationsPage op=new OrganizationsPage(driver);
		Thread.sleep(3000);
		op.enterOrganisationName(text);
		op.clickSubmit();
		Thread.sleep(3000);
		op.popupOkbtn();
		Thread.sleep(3000);
		op.btnEdit();
		Thread.sleep(3000);
		op.enterOrganisationName(text);
		op.updateBtn();
		Thread.sleep(3000);
		op.popupOkbtn();
		op.btnDelete();
		Thread.sleep(3000);
		op.popupDeletebtn();
		op.popupOkbtn();
		Thread.sleep(3000);
		op.clickMail();
		op.ClickLogOut();
		
		}catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	}

}
