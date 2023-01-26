package com.strivemammoth.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.strivemammoth.base.BaseClass;
import com.strivemammoth.pageobjects.LoginPage;
import com.strivemammoth.pageobjects.WashPage;

public class WashPage_TestCases extends BaseClass {

	
	
	LoginPage loginpage;
	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) throws InterruptedException
	{
		launchApp(browser);
		
	}
	
	@Test (groups = "Smoke")
	public void AddWash() throws Exception 
	{

		loginpage = new LoginPage();
		loginpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
		WashPage washpage = new WashPage();
		washpage.GoToWashPage();
		washpage.clickonAddWash();
	}
	

	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void close()
	{
		getDriver().close();
	}
	
	
	
	
}
