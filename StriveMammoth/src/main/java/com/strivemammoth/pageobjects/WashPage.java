package com.strivemammoth.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strivemammoth.actiondriver.ActionClass;
import com.strivemammoth.base.BaseClass;

public class WashPage extends BaseClass {
	
	ActionClass action = new ActionClass();
	
	@FindBy(xpath = "//button[contains(text(),'Add New Wash')]")
	private WebElement AddNewWash;
	
	@FindBy(xpath="//a[text()='Washes']")
	private WebElement washes;
	
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div/div/div/div/form/div[2]/div[1]/input")
	private WebElement barcode;
	
	@FindBy(xpath="//*[@id=\"page-content\"]/div/div/div/div/div/form/div[2]/div[4]/div/button[1]")
	private WebElement select;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement save;
	
	
	public WashPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	public void GoToWashPage() throws InterruptedException
	{
		action.moveToElement(getDriver(), washes);
		action.mouseover(getDriver(), washes);
		action.click(getDriver(), washes);
		Thread.sleep(2000);
		
	}
	
	public void clickonAddWash() throws InterruptedException
	{
		action.click(getDriver(), AddNewWash);
		Thread.sleep(2000);
		action.type(barcode, "89765678");
		action.click(getDriver(), select);
		Thread.sleep(5000);
		action.moveToElement(getDriver(), save);
		action.click(getDriver(), save);
		Thread.sleep(3000);
	}

}
