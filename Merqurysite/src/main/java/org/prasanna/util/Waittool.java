package org.prasanna.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * This the utility tool used to waitfor some elements 
 */
public class Waittool {
	/*
	 * Default wait time for the element
	 */
	public static final int Defalut_wait_element=5;
	/*
	 * Default time for the page to load 
	 */
	public static final int Default_wait_page=10;
	
	
	/*
	 * this methoed is foe the waitfor elementto be visble by the given locator then it would 
	 * return the elements
	 * @param 
	 */
	
	public static WebElement waitforvisiblity(WebDriver driver,By b,int timeout)
	{WebElement element;
		try
		{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); // your seeting the implicit wait to 0 so that the given timeout would work
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(b));
		driver.manage().timeouts().implicitlyWait(Default_wait_page, TimeUnit.SECONDS);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}

}