package com.testScripts;

import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;
import com.portalIntegration.pageObjects.ProjectPage;

public class Tc_DeleteFunction extends BaseClass{
	@Test
	
	public void deleteFunction() throws Exception {
	LoginPage lp=new LoginPage(driver);
	lp.loginApplication();
	ManageUserPage he=new ManageUserPage(driver);
	he.clickManageUser();
	ProjectPage p=new ProjectPage(driver);
	p.searchBar();
	Thread.sleep(2000);
	p.btnDelete();
	Thread.sleep(2000);
	p.popupDeletebtn();
	Thread.sleep(2000);
	p.popupOkbtn();
	Thread.sleep(2000);
	p.clickMail();
	Thread.sleep(2000);
	p.ClickLogOut();
	Thread.sleep(2000);
	
		
		
		
	}

}
