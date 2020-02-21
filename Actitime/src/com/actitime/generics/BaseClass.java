package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public	WebDriver driver;
	public FileLib f=new FileLib();
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
	}

		@BeforeTest
		public void openBrowser() throws IOException {
			String browser = f.getPropertyData("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException {

	driver.get(f.getPropertyData("url"));
	driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
	driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(8000);
	}
	@AfterMethod
	public void logout() {
	driver.findElement(By.id("logoutLink")).click();
	}
}
