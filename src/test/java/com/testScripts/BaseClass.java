package com.testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	public String baseURL = "https://portalintegration.graycelltech.net/";
//	public String baseURL = readconfig.getApplicationURL();
	public String Username ="super@admin.com";
//	public String Username = readconfig.getUserName();
	public String Username2 = readconfig.getUsername2();
	public String Username1 = userName1()+"@gmail.com";
	public String Password = "admins";
//	public String Password = readconfig.getPassWord();
	public String Password1 = passWord1();
	public String Passwrod2 = readconfig.getPassword2();
	public String em=email()+"@gmail.com";
	public String no=contactNumber();
	public String fn=first();
	public String ln=last();
	public String text=text();
	
	public static WebDriver driver;
	@BeforeClass
	public void openApplication() 
	{
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
	
//		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
//		System.setProperty("webdriver.gecko.driver", readconfig.getEdgePath());
//		driver=new EdgeDriver();
//		driver.manage().window().maximize();
//	
	
	
	
	}
	
	@AfterClass
	public void teraDown() 
	{
		//driver.close();
		driver.quit();
	}
	
	public String userName1()
	{
		String setUserName=RandomStringUtils.randomAlphabetic(6);
		return (setUserName);
	}
	
	public String passWord1()
	{
		String setPassword=RandomStringUtils.randomAlphabetic(6);
		return (setPassword);
	}
	
	public String first()
	{
		String setFirstName=RandomStringUtils.randomAlphabetic(5);
		return (setFirstName);
	}
	
	public String last()
	{
		String setLastName=RandomStringUtils.randomAlphabetic(5);
		return (setLastName);
	}
	public String text() 
	{
		String setText=RandomStringUtils.randomAlphabetic(6);
		return (setText);
	}
	public String email() 
	{
		String generateEmail=RandomStringUtils.randomAlphabetic(5);
		return(generateEmail);
	}
	public String contactNumber() 
	{
		String generateNum=RandomStringUtils.randomNumeric(10);
		return(generateNum);
	}
	
	

	/* Run test case on desired browser as we need execute test case on chrome,  firefox, or edge browsers
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		Logger = Logger.getLogger("portal Integration");
		Propertyconfigurator.configure("Log4j.properties");
	
		if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=newChromeDriver();
	}
	else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		driver=newFirefoxDriver();
	}
	else if(br.equals("edge"))
	{
		System.setProperty("webdriver.gecko.driver", readconfig.getEdgePath());
		driver=newMsEdgeDriver();
	}
	driver.get(baseURL);
	system.out.println("Portal integration application open ")
	}
	*/
	
	

	/* public void captureScreen(WebDriver driver, String tname)throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/" + tname + ".png");
		FileUtils.copyFile(Source, target);
		System.out.println("Screenshot taken");
	}

	*/

//testng.xml
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="PortalintegrationV1">
//	  <test name="PortalIntegration Test Functions">
//	    <parameter name="browser" value="chrome" /> 
//	    <classes>
//	      <class name="com.testCases.Tc_LoginTest"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->











}
