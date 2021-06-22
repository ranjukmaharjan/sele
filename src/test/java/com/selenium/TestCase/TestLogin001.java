package com.selenium.TestCase;

import org.testng.annotations.Test;

import com.selenium.page.LoginPage;

public class TestLogin001  extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		
		LoginPage lp =new LoginPage(driver);

		 lp.setemail("Email");
		 lp.setpassword("password");
		 lp.setlogin();
		 
		 
		
		 
		 
		
		
		
	}

}
