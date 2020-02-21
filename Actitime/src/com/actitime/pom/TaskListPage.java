package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerTab;
	@FindBy (xpath="//input[contains(@class,'inputNameField')]")
	private WebElement EnterCustNameTBX;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement Description;
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement CopyProjectDropDown;
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and .='Our company']")
	private WebElement ourcompany;
	@FindBy(xpath="(//div[.='  Create Customer'])[2]")
	private WebElement CreateCustomerBtn;
	@FindBy(xpath="(//div[@class='title' and @title])[1]")
	private WebElement CustomerCreated;
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement TimeTrackTab;
	
	public WebElement getTimeTrackTab() {
		return TimeTrackTab;
	}
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}
	public WebElement getNewCustomerTab() {
		return NewCustomerTab;
	}
	public WebElement getEnterCustNameTBX() {
		return EnterCustNameTBX;
	}
	public WebElement getDescription() {
		return Description;
	}
	public WebElement getCopyProjectDropDown() {
		return CopyProjectDropDown;
	}
	public WebElement getOurcompany() {
		return ourcompany;
	}
	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}
	public WebElement getCustomerCreated() {
		return CustomerCreated;
	}
	}
