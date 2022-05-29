package com.testScripts;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;


public class Tc_ManageUserPage_3 extends BaseClass{

	@Test
	public void addUserFunction() throws IOException {
			
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
				ManageUserPage me=new ManageUserPage(driver);
				me.clickAddUser();
				driver.navigate().back();
				Thread.sleep(5000);
				me.showEntries();
				Thread.sleep(5000);
				me.showEntriesselectionText();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);										
			}catch(Exception e)
			{
				File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\ManageUser.png"));
			}			
			
		}
	}


