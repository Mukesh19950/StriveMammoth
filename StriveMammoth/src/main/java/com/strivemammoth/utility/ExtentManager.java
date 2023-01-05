package com.strivemammoth.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
/**
 * @author Hitendra: ExtentManager class is used for Extent Report
 *  
 */
public class ExtentManager {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void setExtent() {
	
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/MyReport.html");
		
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Tester", "Mukesh");
		
		
		
		
		
		//htmlReporter.config().setDocumentTitle("Automation Test Report");
		//htmlReporter.config().setReportName("Strive Test Automation Report");
		//htmlReporter.config().setTheme(Theme.STANDARD);
		


		
	}
	
	public static void endReport() {
		extent.flush();
	}
}
