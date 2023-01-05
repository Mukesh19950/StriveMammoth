/**
 * 
 */
package com.strivemammoth.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.strivemammoth.base.BaseClass;
import com.strivemammoth.pageobjects.CashRegisterPage;
import com.strivemammoth.pageobjects.LoginPage;
import com.strivemammoth.utility.ExtentManager;

import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;

/**
 * @author mukes
 *
 */
public class CashRegisterPage_TestCase extends BaseClass {
	
	@Parameters("browser")	
	@BeforeMethod(groups = {"Smoke","Sanity","Regression"})
	public void setup(String browser) throws InterruptedException
	{
		launchApp(browser);
		
	}
	
	
	@Test(priority=1, groups = "Smoke")
	public static void GoToCashRegOpen() throws Exception
	
	{
		
		
		
		LoginPage loginpage = new LoginPage();
		loginpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		
		CashRegisterPage cashreg = new CashRegisterPage();
		
		cashreg.GoToCashRegOpen();
		
		
	}
	
	
	@Test(priority=2, groups = "Smoke")
	public void GoToCashRegClose() throws Exception
	
	{
		LoginPage loginpage = new LoginPage();
		loginpage.Signin(prop.getProperty("username"), prop.getProperty("password"));
		CashRegisterPage cashreg = new CashRegisterPage();
		cashreg.GoToCashRegClose();
		
		
	}
	
	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void teardown()
	{
		
		getDriver().quit();
	}
	
	
}
