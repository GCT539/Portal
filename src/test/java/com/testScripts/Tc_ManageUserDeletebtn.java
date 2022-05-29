package com.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_ManageUserDeletebtn extends BaseClass{
	
	@Test
	
	public void deleteAddUserFunction() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		System.out.println("Pring current page URL"+ driver.getCurrentUrl());
		LoginPage lp=new LoginPage(driver);
		lp.setPassword(Password);
		lp.setUserName(Username);
		lp.clickLogin();
		System.out.println("Pring current page URL"+ driver.getCurrentUrl());
		HomepageHeader he=new HomepageHeader(driver);
		he.clickManageUser();
		ManageUserPage me=new ManageUserPage(driver);
		me.clickDeleteBtn();
		me.popup();
		me.popupDeletebtn();
		me.popupOkbtn();
		System.out.println("delete function completed");
		Thread.sleep(3000);
		me.clickMail();
		me.ClickLogOut();
		
		
	
	
	
	}

}
