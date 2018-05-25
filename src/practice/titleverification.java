package practice;

import org.testng.annotations.Test;

import com.snow.generics.BaseTest;

public class titleverification extends BaseTest
{

	@Test
	public void getTitle()
	{
		System.out.println(driver.getTitle());
	}
}
