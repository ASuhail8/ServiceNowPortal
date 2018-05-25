package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.generics.BasePage;

public class HomePage extends BasePage
{

//declaration
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(id="password")
	private WebElement pwTB;
	
	@FindBy(name="login")
	private WebElement loginBTN;
	
//initialization
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
		
	}
	
	public void enterPassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
}
