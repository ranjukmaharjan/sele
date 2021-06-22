package com.selenium.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String Email="RM@gmail.com"	;
	public String baseUrl="https://www.facebook.com/";
	public String password="psw";
	public static WebDriver driver;

	@BeforeClass
	public void Base() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterClass
	public void TearDown(){
		driver.quit();
		
	}
}

