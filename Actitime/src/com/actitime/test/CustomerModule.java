package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass {
@Test
public void testCreateCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	String ExpectedCustomerName = f.getExcelData("CreateCustomer", 1, 3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.taskTabClick();
	Thread.sleep(4000);
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerTab().click();
	t.getEnterCustNameTBX().sendKeys(ExpectedCustomerName);
	t.getCopyProjectDropDown().click();
	t.getOurcompany().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(4000);
	String ActualText = t.getCustomerCreated().getText();
	Assert.assertEquals(ActualText, ExpectedCustomerName);
	t.getTimeTrackTab().click();
	
}
}
