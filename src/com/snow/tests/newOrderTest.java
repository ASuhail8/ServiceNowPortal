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
import com.snow.pages.cartPage;
import com.snow.pages.createINCPage;
import com.snow.pages.iPhonePage;
@Listeners(com.snow.generics.listernsesTest.class)
public class newOrderTest extends BaseTest
{
	
	@Test
	public void TestnewORder() throws Exception
	{
		HomePage hp = new HomePage(driver);
		OSPage OS = new OSPage(driver);
		BbcPage bbc = new BbcPage(driver);
		allCategoryPage allC = new allCategoryPage(driver);
		PasswordResetPage PR = new PasswordResetPage(driver);
		LogoutPage lp = new LogoutPage(driver);
		createINCPage CI = new createINCPage(driver);
		iPhonePage i = new iPhonePage(driver);
		cartPage c = new cartPage(driver);
		
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
		
		allC.ClickOnHardware();
		allC.clickOnIphone6s();
		
		Thread.sleep(1000);
		
		i.Add2cart();
		Thread.sleep(2000);
		
		
		i.clickOnViewCart();
		
		c.clickOnPTC();
		Thread.sleep(2000);
		c.clickonCheckout();
		Thread.sleep(2000);
		// logout
		
		//lp.clickonSysAdmin();
		//lp.clickOnLogout();
		
		
		
	
		
		
		
		
		
	}

}
