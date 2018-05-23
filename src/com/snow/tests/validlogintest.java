package com.snow.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.snow.generics.BaseTest;
import com.snow.pages.HomePage;

@Listeners(com.snow.generics.listernsesTest.class)
public class validlogintest extends BaseTest
{
	
	@Test()
	public void testvalidlogin()
	{
		
		HomePage hp = new HomePage(driver);
		hp.enterUsername();
		hp.enterPassword();
		hp.clickOnLogin();
		
		
	}
	
	
	
	
	
	
	
}
