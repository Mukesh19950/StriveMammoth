package com.strivemammoth.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.strivemammoth.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static Properties prop;
	//public static WebDriver driver;

	//Declare ThreadLocal driver
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	@BeforeSuite (groups = {"Smoke","Sanity","Regression"})
	public static void loadConfig()
	{
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");

		try {
			prop=new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	public static WebDriver getDriver() {

		//Get driver from threadLocalMap
		return driver.get();
	}




	public static void launchApp(String browserName) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		//String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {
			//driver = new ChromeDriver();

			//Set Browser to ThreadLocalMap
			driver.set(new ChromeDriver());

		}else if (browserName.equalsIgnoreCase("FireFox")) {
			//driver = new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			//Set Browser to ThreadLocalMap
			driver.set(new FirefoxDriver());


		}else if (browserName.equalsIgnoreCase("IE")) {
			//driver = new InternetExplorerDriver();
			WebDriverManager.iedriver().setup();
			//Set Browser to ThreadLocalMap
			driver.set(new InternetExplorerDriver());

		}

		//Maximize the screen
		getDriver().manage().window().maximize();
		//Delete all the cookies
		getDriver().manage().deleteAllCookies();
		//Implicit TimeOuts
		getDriver().manage().timeouts().implicitlyWait
		(Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
		//PageLoad TimeOuts
		getDriver().manage().timeouts().pageLoadTimeout
		(Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
		//Launching the URL
		getDriver().get(prop.getProperty("url"));
	}
	
	

	@AfterSuite (groups = {"Smoke","Sanity","Regression"})
	public void endextent() {

		ExtentManager.endReport();
	}

}





