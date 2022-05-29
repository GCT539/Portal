package com.testScripts;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;

public class Tc_LinksHomePage extends BaseClass{
	@Test
	
	public void linksOnHomePage() throws Exception {
	try {
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
		List<WebElement>links = driver.findElements(By.tagName("a"));
		for(WebElement linksdata:links) {
		System.out.println("links on Home page: "+linksdata.getText());
		}
		}
		catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\PortalIntegration\\GIT\\Portal\\PortalIntegrationV1\\ScreenShots\\TestResults.png"));		
		}
	}
}
