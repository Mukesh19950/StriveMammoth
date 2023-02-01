package com.strivemammoth.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strivemammoth.actiondriver.ActionClass;
import com.strivemammoth.base.BaseClass;

public class ClientSearch extends BaseClass {

	ActionClass action = new ActionClass();
	
	@FindBy(xpath="//a[text()='Admin']")
	private WebElement admin;
	
	
	@FindBy(xpath = "//a[@href='#/admin/vehicle']")
	private WebElement vehicle;
	
	@FindBy(xpath = "//input[@id='inputSearchbyName']")
	private WebElement vehiclesearch;
	
	
	public ClientSearch() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	public void searchclient() throws Exception
	{
		
		action.moveToElement(getDriver(), admin);
		action.mouseover(getDriver(), admin);
		action.click(getDriver(), admin);
		Thread.sleep(2000);
		action.click(getDriver(), vehicle);
		Thread.sleep(4000);
		action.type(vehiclesearch, "MUKESH");
		Thread.sleep(4000);
		
		
	}
	
	
	
	
}
