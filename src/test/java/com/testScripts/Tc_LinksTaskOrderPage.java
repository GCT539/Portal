package com.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_LinksTaskOrderPage extends BaseClass{
@Test
	
	public void links() throws Exception  {
		driver.navigate().to(baseURL);
		LoginPage lp =new LoginPage(driver);
		HomepageHeader he=new HomepageHeader(driver);
		lp.loginApplication();
		he.clickTaskOrder();
		Thread.sleep(2000);
		List<WebElement>links = driver.findElements(By.tagName("a"));
		for(WebElement linksdata:links) {
		System.out.println("links on Manage user page: "+linksdata.getText());
	}}

}
	