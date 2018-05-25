package com.snow.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.snow.genericUtils.ExcelData;
import com.snow.generics.BaseTest;
import com.snow.pages.HomePage;
import com.snow.pages.LogoutPage;
import com.snow.pages.OSPage;

@Listeners(com.snow.generics.listernsesTest.class)
public class validloginlogouttest extends BaseTest
{

	@Test
	public void testvalidloginlogout() throws Exception
	{
		HomePage hp = new HomePage(driver);
		
		//verify Title
		
		String eTitle = ExcelData.getData(input_path, "LoginPage", 1, 2);
		hp.verifyTitle(eTitle);
		
		//login
		String un = ExcelData.getData(input_path, "LoginPage", 1, 0);
		hp.enterUsername(un);
		String pwd = ExcelData.getData(input_path, "LoginPage", 1, 1);
		hp.enterPassword(pwd);
		hp.clickOnLogin();
		
		//verify homepage Title
		
		OSPage o = new OSPage(driver);
		String hTitle = ExcelData.getData(input_path, "HomePage", 1, 0);
		o.verifyTitle(hTitle);
		
		
		
		//logout
		
		LogoutPage lp = new LogoutPage(driver);
		lp.clickonSysAdmin();
		lp.clickOnLogout();
		
				
		//verify Title
		
		hp.verifyTitle(eTitle);
		
		
	}
	
}
