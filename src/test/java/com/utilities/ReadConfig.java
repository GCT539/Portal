package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL() 
	{
		String url =pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() 
	{
		String username =pro.getProperty("username");
		return username;
	}
	
	public String getUsername1() 
	{
		String username1 =pro.getProperty("username1");
		return username1;
	}
	
	public String getUsername2() 
	{
		String username2 =pro.getProperty("username2");
		return username2;
	}

	public String getPassWord() 
	{
		String password =pro.getProperty("password");
		return password;
	}
	
	public String getPassWord1() 
	{
		String password1 =pro.getProperty("password1");
		return password1;
	}

	public String getPassword2() 
	{
		String password2 =pro.getProperty("password2");
		return password2;
	}
	
	public String getChromePath() 
	{
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() 
	{
		String firefoxpath =pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getEdgePath() 
	{
		String edgepath =pro.getProperty("edgepath");
		return edgepath;
	}
	


}
