package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class LogoutPage extends BasePage
{
	
	//Decleration
	
	@FindBy(xpath="//span[.='System Administrator']")
	private WebElement SysAdmin;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutBTN;
	
	
	//initialization
	
	public LogoutPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	public void clickonSysAdmin()
	{
		SysAdmin.click();
	}
	
	public void clickOnLogout()
	{
		logoutBTN.click();	
	}
	
	
	

}
