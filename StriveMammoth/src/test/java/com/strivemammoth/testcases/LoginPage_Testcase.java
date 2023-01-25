package com.strivemammoth.testcases;



import java.util.HashMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.strivemammoth.base.BaseClass;
import com.strivemammoth.dataprovider.DataProviders;
import com.strivemammoth.pageobjects.ClientsPage;
import com.strivemammoth.pageobjects.LoginPage;
import com.strivemammoth.utility.Log;


public class LoginPage_Testcase extends BaseClass{

	LoginPage loginpage;
	@Parameters("browser")

	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})

	public void setup(String browser) throws InterruptedException
	{
		launchApp(browser);

	}
	@Test(groups = "Sanity")
	public void Login() throws Exception 
	{

		loginpage = new LoginPage();

		Log.info("Enter username and Password");
		loginpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Helloooomkooo");

	}

	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void close()
	{
		getDriver().close();
	}









}
