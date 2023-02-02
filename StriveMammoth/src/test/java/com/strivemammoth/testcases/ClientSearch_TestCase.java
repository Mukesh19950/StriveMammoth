package com.strivemammoth.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.strivemammoth.base.BaseClass;

public class ClientSearch_TestCase extends BaseClass{
	
	
	
	
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws InterruptedException
	{
	 
	launchApp(browserName);
		
	}
	
	
	
	@Test
	public void clientsearch()
	{
		
		
	}
	
	
	
	@AfterMethod
	public void close()
	{
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
