package org.prasanna.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
/*
 * This is the new page that is opened when you click on
 * Business Travel @ About.com
Salon Travel link  
 */



public class Businesstravelpage extends Page {
	
	private static String Businesstravelpagewindowhandle;
//	private static String previouswindowHandle;
	
	/*
	 * when you create object of Businesstravelpage your switching the window Handle 
	 */

	public Businesstravelpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		System.out.println("current window handle is ....."+Home.Homewindwohandle);
		Set<String> s=driver.getWindowHandles();
		for(String temp:s)
		{
			System.out.println("--------"+temp);
			if(temp!=Home.Homewindwohandle)
			{
				Businesstravelpagewindowhandle=temp;
				System.out.println("window handle of Businesstravelpage is .... "+Businesstravelpagewindowhandle);
			}
		}
		
		driver.switchTo().window(Businesstravelpagewindowhandle);
		
		System.out.println("swtiching to this window handle....");
	}
	
	public void switchtoprevioushandle()
	{
		driver.switchTo().window(Home.Homewindwohandle);
		
		System.out.println("switched to previous window handle.....");
	}
	
	public void closeBusinesstravelpage()
	{
		System.out.println("closing the Business travel page");
		driver.close();
	}
	
	

}
