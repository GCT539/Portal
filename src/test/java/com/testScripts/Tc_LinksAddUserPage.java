package com.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;

public class Tc_LinksAddUserPage extends BaseClass{

@Test
	
	public void links() throws Exception  {
		LoginPage lp =new LoginPage(driver);
		ManageUserPage me=new ManageUserPage(driver);
		lp.loginApplication();
		me.clickManageUser();
		Thread.sleep(2000);
		me.clickAddUser();
		Thread.sleep(3000);
		List<WebElement>links = driver.findElements(By.tagName("a"));
		for(WebElement linksdata:links) {
		System.out.println("links on Manage user page: "+linksdata.getText());
	}}

}
