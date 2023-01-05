/**
 * 
 */
package com.strivemammoth.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strivemammoth.actiondriver.ActionClass;
import com.strivemammoth.base.BaseClass;

/**
 * @author mukes
 *
 */
public class CashRegisterPage extends BaseClass {
	
	ActionClass action = new ActionClass();
	
	@FindBy(xpath="//a[text()='Admin']")
	private WebElement admin;
	
	
	@FindBy(xpath = "//*[@id=\"navSliderMenu\"]/ul/li[1]/a")
	private WebElement Cashreg;
	
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/section[1]/div[1]/app-admin[1]/app-cash-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ngx-timepicker-field[1]/div[1]/ngx-timepicker-time-control[1]/div[1]/input[1]")
	private WebElement TimeHRS;
	
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/section[1]/div[1]/app-admin[1]/app-cash-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ngx-timepicker-field[1]/div[1]/ngx-timepicker-time-control[2]/div[1]/input[1]")
	private WebElement TimeMIN;
	
	@FindBy(xpath = "//body/app-root[1]/div[1]/section[1]/div[1]/app-admin[1]/app-cash-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
	private WebElement shopstatus;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement Save;
	
	public CashRegisterPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void GoToCashRegOpen() throws InterruptedException {
		// TODO Auto-generated method stub
		action.moveToElement(getDriver(), admin);
		action.mouseover(getDriver(), admin);
		action.click(getDriver(), admin);
		Thread.sleep(2000);
		action.click(getDriver(), Cashreg);
		Thread.sleep(2000);
		action.type(TimeHRS, "08");
		action.type(TimeMIN, "05");
		action.selectByValue(shopstatus, "34556");
		Thread.sleep(2000);
		action.click(getDriver(), Save);
		Thread.sleep(2000);
	}
	
	
	public void GoToCashRegClose() throws InterruptedException {
		// TODO Auto-generated method stub
		action.moveToElement(getDriver(), admin);
		action.mouseover(getDriver(), admin);
		action.click(getDriver(), admin);
		Thread.sleep(2000);
		action.click(getDriver(), Cashreg);
		Thread.sleep(2000);
		action.type(TimeHRS, "17");
		action.type(TimeMIN, "05");
		action.selectByValue(shopstatus, "34558");
		Thread.sleep(2000);
		action.click(getDriver(), Save);
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	

}
