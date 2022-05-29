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
import com.portalIntegration.pageObjects.PrimeContractorPage;
import com.portalIntegration.pageObjects.TaskOrderPage;

public class Tc_8_PrimeContractorPage extends BaseClass{
	@Test
	
	public void primeContractorPageObj() throws Exception {
		try {		
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		lp.loginApplication();
		HomepageHeader he=new HomepageHeader(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		he.clickPrimeContractor();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		PrimeContractorPage pc=new PrimeContractorPage(driver);
		Thread.sleep(3000);
		pc.enterPrimeContractorName(text);
		pc.clickSubmit();
		pc.popupOkbtn();
		Thread.sleep(3000);
		pc.btnEdit();
		Thread.sleep(3000);
		pc.enterPrimeContractorName(text);
		pc.updateBtn();
		Thread.sleep(3000);
		pc.popupOkbtn();
		Thread.sleep(3000);
		pc.deleteBtn();
		Thread.sleep(3000);
		pc.popupDeletebtn();
		Thread.sleep(3000);
		pc.popupOkbtn();
		Thread.sleep(3000);
		pc.clickMail();
		Thread.sleep(3000);
		pc.ClickLogOut();
		
	}catch (Exception e){
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
	}
}
}
