package com.snow.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.snow.genericUtils.ExcelData;
import com.snow.generics.BaseTest;
import com.snow.pages.BbcPage;
import com.snow.pages.HomePage;
import com.snow.pages.LogoutPage;
import com.snow.pages.OSPage;
import com.snow.pages.PasswordResetPage;
import com.snow.pages.allCategoryPage;
import com.snow.pages.createINCPage;
@Listeners(com.snow.generics.listernsesTest.class)
public class createINCtest extends BaseTest
{

	@Test
	public void TestCreateINC() throws Exception
	{
		
		HomePage hp = new HomePage(driver);
		OSPage OS = new OSPage(driver);
		BbcPage bbc = new BbcPage(driver);
		allCategoryPage allC = new allCategoryPage(driver);
		PasswordResetPage PR = new PasswordResetPage(driver);
		LogoutPage lp = new LogoutPage(driver);
		createINCPage CI = new createINCPage(driver);
		
		//verifyTitle
		
		
		
		//login
		String un = ExcelData.getData(input_path, "LoginPage", 1, 0);
		hp.enterUsername(un);
		String pwd = ExcelData.getData(input_path, "LoginPage", 1, 1);
		hp.enterPassword(pwd);
		hp.clickOnLogin();
		
		// Click on Order Something
		
		OS.OrderSomething();
		
		//click on Browse all category
		
		bbc.Browsebycategory();
		
		//click on how can we help you ?
		
		allC.clickoncanwehelpyou();
		
		allC.clickOnCreateINC();
		
		CI.clickonUrgencytab();
		CI.clickonHigh();
		
		String des = ExcelData.getData(input_path, "createINCPage", 1, 0);
		CI.enterDescription(des);
		CI.clickOnSubmit();
		CI.DisplayMsg();
		
		lp.clickonSysAdmin();
		lp.clickOnLogout();
		
		
		
		
		
		
	}
	
}
