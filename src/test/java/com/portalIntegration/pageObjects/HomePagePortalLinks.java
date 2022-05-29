package com.portalIntegration.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePagePortalLinks {
	
	WebDriver ldriver;
	
	public HomePagePortalLinks(WebDriver remotedriver) 
	{
		ldriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
		
		@FindBy (xpath = "//a[@class='view-btn gdx-button']")
		@CacheLookup
		WebElement linkGDSTravelProtal;
		
		@FindBy (xpath = "//a[@class='view-btn mdis-travel-button']")
		@CacheLookup
		WebElement linkMDISTravelProtal;
		
		@FindBy (xpath = "//a[@class='view-btn team-koniag-button']")
		@CacheLookup
		WebElement linkTeamKoniagTravelProtal;

		@FindBy (xpath = "//a[@class='view-btn csw-travel-portal-button']")
		@CacheLookup
		WebElement linkCSWTravelProtal;

		@FindBy (xpath = "//a[@class='view-btn pils-team-button']")
		@CacheLookup
		WebElement linkPilsTeamProtal;
		
		@FindBy (xpath = "//a[@class='view-btn hi-scheduling-button']")
		@CacheLookup
		WebElement linkHiSchedulingProtal;
		
		@FindBy (how = How.XPATH, using ="//a[@id='navbarDropdownMenuLink']")
		@CacheLookup
		WebElement linkMailID;
		
		@FindBy (how = How.XPATH, using = "//a[@href='/Account/Logout']")
		@CacheLookup
		WebElement linkLogOut;
		
		public void clickMail()
		{
			linkMailID.click();
		}

		public void ClickLogOut()
		{
			linkLogOut.click();
		}
		
		public void clickGDS() 
		{
			linkGDSTravelProtal.isSelected();
			linkGDSTravelProtal.click();
		}
		
		public void clickMDIS() 
		{
			linkMDISTravelProtal.click();
			System.out.println("MDIS portals is selected");
			linkMDISTravelProtal.isEnabled();
//			linkMDISTravelProtal.isDisplayed();
		}
		
		public void clickTeamKoniag() 
		{
			linkTeamKoniagTravelProtal.click();
			linkTeamKoniagTravelProtal.isSelected();
			linkTeamKoniagTravelProtal.isDisplayed();
		}
	
		public void clickCSW() 
		{
			linkCSWTravelProtal.click();
			linkCSWTravelProtal.isSelected();
			linkCSWTravelProtal.isDisplayed();
		}

		public void clickPILSTeam() 
		{
			linkPilsTeamProtal.click();
			linkPilsTeamProtal.isSelected();
			linkPilsTeamProtal.isDisplayed();
		}

		public void clickHiScheduling() 
		{
			linkHiSchedulingProtal.click();
			linkHiSchedulingProtal.isDisplayed();
			linkHiSchedulingProtal.isSelected();
		}



}


