package com.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.portalIntegration.pageObjects.HomepageHeader;
import com.portalIntegration.pageObjects.LoginPage;
import com.portalIntegration.pageObjects.ManageUserPage;
import com.portalIntegration.pageObjects.OrganizationsPage;

public class Tc_14_ShowEntries extends BaseClass{
	
	@Test
	
	public void showEntries() throws Exception {
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(Username);
		lp.setPassword(Password);
		lp.clickLogin();
		Thread.sleep(2000);
		HomepageHeader he=new HomepageHeader(driver);
		he.clickManageUser();
		ManageUserPage mu=new ManageUserPage(driver);
		String entry="//select[@name='table_id_length']";
		Select showEntries=new Select(driver.findElement(By.xpath(entry)));
		
		List<WebElement> showEntry=showEntries.getOptions();
		System.out.println("Print the show entries options: " );
		Thread.sleep(2000);
		for(WebElement options: showEntry) {
			System.out.println(options.getText());
		}
		
		System.out.println("select the option by index 2");
		showEntries.selectByIndex(0);
		Thread.sleep(3000);
		System.out.println("select value is : " + showEntries.getFirstSelectedOption().getText());
		mu.showEntriesselectionText();
		
		System.out.println("select the option by text 25");
		showEntries.selectByValue("25");
		Thread.sleep(3000);
		System.out.println("select value is : " + showEntries.getFirstSelectedOption().getText());
		mu.showEntriesselectionText();
		
		System.out.println("select the option by index 2");
		showEntries.selectByIndex(2);
		Thread.sleep(3000);
		System.out.println("select value is : " + showEntries.getFirstSelectedOption().getText());
		mu.showEntriesselectionText();
		
		System.out.println("select the option by value 100");
		showEntries.selectByVisibleText("100");
		Thread.sleep(3000);
		System.out.println("select value is : " + showEntries.getFirstSelectedOption().getText());
		mu.showEntriesselectionText();
		
		
		
		
		
		
		
	}

}
