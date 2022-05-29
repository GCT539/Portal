package com.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomePagePortalLinks;
import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;

import io.reactivex.rxjava3.exceptions.Exceptions;

public class Tc_PortalGDS extends BaseClass{
	@Test
	
	public void portalGDS() throws Exception{
		
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
		Object isDisplayed = null;
		hpo.clickGDS();
		Thread.sleep(5000);
		System.out.println("Print GDS portal home Url: "+ driver.getCurrentUrl());
		
	}
}
