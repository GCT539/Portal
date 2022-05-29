package com.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;

public class Tc_LoginLinks extends BaseClass{
	@Test()
	
	public void linksOnLoginPage() 
	{
		driver.get(baseURL);
		System.out.println("Title of the web page; "+ driver.getTitle());
		driver.manage().window().maximize();
		System.out.println("Launch the Browser");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		System.out.println("Enter the Username:"+ Username);
		lp.setPassword(Password);
		System.out.println("Enter the Password:"+ Password);
		List<WebElement>links = driver.findElements(By.tagName("input"));
		for(WebElement linksdata:links) {
			System.out.println(linksdata.getText());
		}
		lp.clickLogin();
		
	}

}
