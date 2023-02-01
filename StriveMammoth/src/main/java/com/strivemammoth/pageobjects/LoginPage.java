package com.strivemammoth.pageobjects;

import com.strivemammoth.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strivemammoth.actiondriver.ActionClass;

public class LoginPage extends BaseClass {
	
	ActionClass action = new ActionClass();
	
	@FindBy(id="emailId")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(xpath="//button[text()='Login']")
	private WebElement signInBtn1;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/section[1]/div[1]/app-select-location[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
	private WebElement chooseLoc;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	
	
	@FindBy(xpath="//*[@id=\"login\"]/div/div/div[2]/div/div/h1")
	private WebElement Label;
	
	
	//Initialize the WebElements
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	//Performing User Actions
	public void Signin(String uname, String passwd) throws Exception
	{
		action.type(userName, uname);
		action.type(password, passwd);
		action.click(getDriver(), signInBtn1);
		Thread.sleep(5000);
		action.selectByValue(chooseLoc, "2");
		Thread.sleep(5000);
		action.click(getDriver(), proceed);
		Thread.sleep(10000);
		
		
		
	}
	
	
	
	
}


