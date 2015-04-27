package org.prasanna.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Headers{
	
	
    public static String Homewindwohandle;
	private static String businesstravel_xpath="//a[contains(text(),'Business')]";
	public Home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* this is to verify the Home page loaded properly or not
	 * (non-Javadoc)
	 * @see org.prasanna.pages.Headers#Verifypage()
	 */
	@Override
	public boolean Verifypage() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public Businesstravelpage clickonbusinesstravellink()
	{
		Homewindwohandle=driver.getWindowHandle();
		driver.findElement(By.xpath(businesstravel_xpath)).click();
		return(new Businesstravelpage(driver));
	}

}
