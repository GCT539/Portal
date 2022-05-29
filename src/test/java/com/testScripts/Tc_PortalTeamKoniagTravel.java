package com.testScripts;

import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomePagePortalLinks;
import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;

public class Tc_PortalTeamKoniagTravel extends BaseClass {

@Test
	
	public void portalTEAMKONIAG() throws Exception{
		
		driver.get(baseURL);
		System.out.println("Title of the web page; "+ driver.getTitle());
		driver.manage().window().maximize();
		System.out.println("Launch the Browser");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		System.out.println("Enter the Username:"+ Username);
		lp.setPassword(Password);
		System.out.println("Enter the Password:"+ Password);
		lp.clickLogin();
		HomepageHeader he=new HomepageHeader(driver);
		he.clickManageUser();
		driver.navigate().back();
		Thread.sleep(3000);
		HomePagePortalLinks hpo= new HomePagePortalLinks(driver);
		hpo.clickTeamKoniag();
		Thread.sleep(5000);
		
	}
}
