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

public class ClientPage_TestCase extends BaseClass {
	
	LoginPage loginpage;
	@Parameters("browser")
    @BeforeMethod(groups = {"Smoke","Sanity","Regression"})
    public void setup(String browser) throws InterruptedException
	{
		launchApp(browser);
		
	}
	

	@Test(dataProvider = "newclients", dataProviderClass = DataProviders.class, groups = "Regression")
	public void SignIntoLoc(HashMap<String,String> hashMapValue) throws Exception
	{

		loginpage = new LoginPage();
		loginpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		
		ClientsPage clients = new ClientsPage();
    	clients.AddNewClient(
    			hashMapValue.get("FirstName"),
				hashMapValue.get("LastName"),
				hashMapValue.get("Address"),
				hashMapValue.get("Email"),
				hashMapValue.get("Phone"),
				hashMapValue.get("Type"),
				hashMapValue.get("Location"));
    	clients.clickonsave();
		    
	}
    

    @AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void close()
	{
		getDriver().close();
	}
	

}
