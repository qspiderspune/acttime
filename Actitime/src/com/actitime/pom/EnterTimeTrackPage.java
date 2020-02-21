package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	@FindBy(id="container_tasks")
	private WebElement taskTab;

	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logoutClick() {
		logoutbtn.click();
	}
	public void taskTabClick() {
		taskTab.click();
	}
}
