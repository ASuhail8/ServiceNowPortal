package com.snow.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.snow.genericUtils.ExcelData;
import com.snow.generics.BasePage;
import com.snow.generics.BaseTest;
import com.snow.pages.HomePage;


@Listeners(com.snow.generics.listernsesTest.class)
public class validlogintest extends BaseTest
{
	
	@Test()
	public void testvalidlogin() throws Exception
	{
		
		
		
		HomePage hp = new HomePage(driver);
		
		//verify Title
		
		
		String eTitle = ExcelData.getData(input_path, "LoginPage", 1, 2);
		hp.verifyTitle(eTitle);		
		String un = ExcelData.getData(input_path, "LoginPage", 1, 0);
		hp.enterUsername(un);
		String pwd = ExcelData.getData(input_path, "LoginPage", 1, 1);
		hp.enterPassword(pwd);
		hp.clickOnLogin();
		
		
	}
	
	
	
	
	
	
	
}
