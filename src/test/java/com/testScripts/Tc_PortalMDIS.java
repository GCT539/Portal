package com.testScripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomePagePortalLinks;
import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;

public class Tc_PortalMDIS extends BaseClass {
@Test
	
	public void portalMDIS() throws Exception{
	try {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
		driver.get(baseURL);
		System.out.println("Title of the web page; "+ driver.getTitle());
		driver.manage().window().maximize();
		System.out.println("Launch the Browser");
		LoginPage lp=new LoginPage(driver);
		lp.loginApplication();
		Thread.sleep(5000);
		HomePagePortalLinks hpo= new HomePagePortalLinks(driver);
		hpo.clickMDIS();
		Thread.sleep(5000);
	}	catch (Exception e){
	File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
}
		
			
	}

}
