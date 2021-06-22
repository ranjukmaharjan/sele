package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
				
		
	}
@FindBy(name="email")
WebElement emailElement;

@FindBy(name="pass")
WebElement password;

@FindBy(name="login")
WebElement btnElement;

public void setemail (String email) {
	emailElement.sendKeys("email");
	
}

public void setpassword(String psw) {
	password.sendKeys("psw");
	
	
}

public void setlogin() {
	btnElement.click();
}
	
	
}
