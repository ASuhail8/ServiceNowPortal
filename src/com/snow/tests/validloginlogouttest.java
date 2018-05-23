package com.snow.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.snow.generics.BaseTest;
import com.snow.pages.HomePage;
import com.snow.pages.LogoutPage;

@Listeners(com.snow.generics.listernsesTest.class)
public class validloginlogouttest extends BaseTest
{

	@Test
	public void testvalidloginlogout()
	{
		HomePage hp = new HomePage(driver);
		
		//login
		hp.enterUsername();
		hp.enterPassword();
		hp.clickOnLogin();
		
		//logout
		
		LogoutPage lp = new LogoutPage(driver);
		lp.clickonSysAdmin();
		lp.clickOnLogout();
		
				
		
		
	}
	
}
