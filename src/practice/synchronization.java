package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization 
{

	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.fb.com");
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement firstname = driver.findElement(By.name("firstname"));
	WebElement lastname = driver.findElement(By.name("lastname"));
	WebElement mobile = driver.findElement(By.name("reg_email__"));
	WebElement password = driver.findElement(By.name("reg_passwd__"));	
	WebElement forgotaccount = driver.findElement(By.linkText("Forgotten account?"));	
		
	sendKeys(driver, 10, firstname, "Abdulla");
	sendKeys(driver, 2, lastname, "Suhail");
	sendKeys(driver, 2, mobile, "8197283008");
	sendKeys(driver, 2, password, "123");
	elementtoclick(driver, 5, forgotaccount);	
	
	driver.quit();
	
	}
	
	
	public static void sendKeys(WebDriver driver,int timeout, WebElement element,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	
	public static void elementtoclick(WebDriver driver,int timeout, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	

	
	
	
	
	
	
	
}
