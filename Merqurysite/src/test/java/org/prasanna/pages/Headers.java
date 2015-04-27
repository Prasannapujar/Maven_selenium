package org.prasanna.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * this Represent the SIDE page Headers and TOP PAGE Headers
 * @author Prasanna
 *  
 */
public abstract class Headers extends Page{
	
	private static String home_xpath="//a[text()='Home']";

	public Headers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method all page class has to implement objective of this class is to verify the page displayed 
	 * proper or not 
	 * @return true : if sucesses else false
	 * @return false : if fails
	 */
	public abstract boolean Verifypage();
	
	/*
	 * click on the Home link 
	 */
	public Home clickonHome()
	{
		driver.findElement(By.xpath(home_xpath)).click();
		return new Home(driver);
	}
	

}
