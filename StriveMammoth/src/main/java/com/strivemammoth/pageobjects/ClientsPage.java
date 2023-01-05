package com.strivemammoth.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.strivemammoth.actiondriver.ActionClass;
import com.strivemammoth.base.BaseClass;

public class ClientsPage extends BaseClass {

	ActionClass action = new ActionClass();

	@FindBy(xpath="//a[text()='Admin']")
	private WebElement admin;

	@FindBy(xpath = "//*[@id=\"navSliderMenu\"]/ul/li[4]/a")
	private WebElement clients;

	@FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div/div/div/div/div/div[1]/div/button")
	private WebElement addnewclient;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[1]/div[1]/input")
	private WebElement firstname;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[1]/div[2]/input")
	private WebElement lastname;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[1]/div[3]/input")
	private WebElement clientaddress;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[1]/div[4]/input")
	private WebElement clientemail;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[2]/div[1]/div/div[1]/input")
	private WebElement clientphone;

	@FindBy(xpath="//body/app-root[1]/div[1]/section[1]/div[1]/app-admin[1]/app-client[1]/app-client-list[1]/div[1]/app-client-create-edit[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-client-form[1]/form[1]/div[2]/div[3]/app-state-dropdown[1]/p-dropdown[1]/div[1]")
	private WebElement state;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[2]/div[3]/app-state-dropdown/p-dropdown/div/div[4]/div[2]/ul/p-dropdownitem[1]/li")
	private WebElement selectstate;

	@FindBy(xpath="//body/app-root[1]/div[1]/section[1]/div[1]/app-admin[1]/app-client[1]/app-client-list[1]/div[1]/app-client-create-edit[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-client-form[1]/form[1]/div[2]/div[4]/app-city[1]/p-dropdown[1]/div[1]")
	private WebElement City;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[3]/div[1]/div/div[1]/input")
	private WebElement Zipcode;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[3]/div[2]/div/div[2]/select")
	private WebElement clienttype;

	@FindBy(xpath="//*[@id=\"Clientviewedit\"]/app-client-form/form/div[3]/div[3]/select")
	private WebElement clientlocation;;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement Save;;

	public ClientsPage() {
		PageFactory.initElements(getDriver(), this);
	}



	/*public void AddClient() throws InterruptedException
	{

		action.moveToElement(getDriver(), admin);
		action.mouseover(getDriver(), admin);
		action.click(getDriver(), admin);
		Thread.sleep(3000);
		action.click(getDriver(), clients);
		Thread.sleep(3000);
		action.click(getDriver(), addnewclient);
		action.type(Firstname, "Sumo");
		action.type(Lastname, "Kanna");
		action.type(Address, "Raja Street");
		action.type(Email, "sumo@gmail.com");
		action.type(Phone, "9874459058");
		action.click(getDriver(), State);
		action.click(getDriver(), selectstate);
		action.selectByValue(Type, "82");	
		action.selectByValue(Location, "2");	
		Thread.sleep(3000);
		action.click(getDriver(), Save);
		Thread.sleep(3000);
	}*/



	public void AddNewClient(String fname, String lname, String address, String email, String phone, String type, String location) throws InterruptedException
	{

		//Click on Admin Module
		action.moveToElement(getDriver(), admin);
		action.mouseover(getDriver(), admin);
		action.click(getDriver(), admin);
		Thread.sleep(3000);


		//Click on Client Page
		action.click(getDriver(), clients);
		Thread.sleep(3000);

		//Click on Add New Client
		action.click(getDriver(), addnewclient);
		Thread.sleep(3000);

		//Client Data 
		action.type(firstname, fname);
		action.type(lastname, lname);
		action.type(clientaddress, address);
		action.type(clientemail, email);
		action.type(clientphone, phone);
		action.selectByVisibleText(type, clienttype);
		action.selectByVisibleText(location, clientlocation);

	}

	public void clickonsave () throws Exception
	{

		action.click(getDriver(), Save);

		Thread.sleep(7000);
	}
























}
