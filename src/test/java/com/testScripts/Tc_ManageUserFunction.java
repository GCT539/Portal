package com.testScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_ManageUserFunction extends BaseClass{
	@Test
	
	public void showEntries() throws Exception 
	{
	try {
		
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ManageUserPage me=new ManageUserPage(driver);
		lp.loginApplication();
		me.clickManageUser();
		Thread.sleep(1000);
		
		WebElement linkshowEntriesOpt=driver.findElement(By.xpath("//select[contains(@name, 'table_id_length')]"));
		Select drop=new Select(linkshowEntriesOpt);
		drop.selectByIndex(1);
		Thread.sleep(2000);
		
		// enter the particular user name on search engine
		Scanner text=new Scanner(System.in);
		System.out.println("enter text:");
		String data=text.nextLine(); 
		me.SelectSearchBar(data);
		Thread.sleep(2000);
		me.clickMail();
		Thread.sleep(2000);
		me.ClickLogOut();
		
		
		
		
		
		
	}catch(Exception e){
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
	}
		
	}

}
