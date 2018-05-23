package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.snow.generics.BasePage;

public class createINCPage extends BasePage
{

	@FindBy(xpath="//span[.='-- None --']")
	private WebElement Urgency;
	
	@FindBy(xpath="//div[.='1 - High']")
	private WebElement High;
	
	@FindBy(xpath="//*[@id=\"sp_formfield_IO:3f272c500a0a0b990059c24380a2bc02\"]")
	private WebElement textArea;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submitBTN;
	
	@FindBy(xpath="//div[@class='ng-binding ng-scope']")
	private WebElement INCMsg;
	
	public createINCPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickonUrgencytab()
	{
		Urgency.click();
	}
	
	public void clickonHigh()
	{
		High.click();
	}
	
	public void enterDescription()
	{
		textArea.sendKeys("This is a test INC");
	}
	
	public void clickOnSubmit()
	{
		submitBTN.click();
	}
	
	public void DisplayMsg()
	{
		Reporter.log(INCMsg.getText(),true);
	}
}
