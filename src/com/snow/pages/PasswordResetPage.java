package com.snow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.snow.generics.BasePage;

public class PasswordResetPage extends BasePage
{
	
	@FindBy(xpath="//*[@id=\"xd388c770d7000200a9ad1e173e24d425\"]/div/div/div[2]/div/div[5]/div/a/div/h2")
	private WebElement PassReset;
	

	@FindBy(xpath="//*[@id=\"s2id_sp_formfield_IO:2a2be6520a0a020e00d111208c9c6391\"]/a")
	private WebElement AppPassRes;
	
	@FindBy(xpath="(//div[.='Email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="(//div[.='Email'])[1]")
	private WebElement emailCB;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submitBTN;
	
	@FindBy(xpath="//p[@class='ng-binding']")
	private WebElement INCMsg;
	
	
	
	
	public PasswordResetPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
		public void ClickonPassRes()
		{
			PassReset.click();
		}
		
	
		
		public void clickOnAppPassNeedRes()
		{
			AppPassRes.click();
		}
		
		public void typeEmail()
		{
			email.click();
		}
		
		public void clickonEmailCB()
		{
			emailCB.click();
		}
		
		public void clickOnSubmit()
		{
			submitBTN.click();
		}
		
		public void displayMsg()
		{
			Reporter.log(INCMsg.getText(),true);
		}
		
		
		
		
		
		
		
		
	

}
