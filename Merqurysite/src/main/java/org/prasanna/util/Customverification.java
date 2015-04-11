package org.prasanna.util;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class Customverification {
	
	StringBuffer msg;
	Boolean flag=true;
	public Customverification() {
    msg=new StringBuffer();		
}

	
	public void checkifequal(String stepname,String Expected,String Actual )
	{
		try
		{
			
			Assert.assertEquals(Actual, Expected);
			Reporter.log(stepname+"working fine"+"<br>");
		}
		catch(Error e)
		{
			Reporter.log(stepname+"failed"+"Expeceted was.... "+Expected+"But in the application"+Actual+"<br>");
			flag=false;
		}
		
	}
	
	public void checkiftrue(String stepname,Boolean b)
	{
		try
		{
		Assert.assertTrue(b.booleanValue());
		Reporter.log(stepname+"working fine"+"<br>");
		}
		catch(Error e)
		{
			Reporter.log(stepname+"failed"+"<br>");
			flag=false;
		}
	}
	
	public void checkiffalse(String stepname,Boolean b)
	{
		try
		{
			Assert.assertFalse(b.booleanValue());
			Reporter.log(stepname+"working fine"+"<br>");
		}
		
		catch(Error e)
		{
			Reporter.log(stepname+"failed"+"<br>");
			flag=false;
		}
	}
	
	public Boolean Returnstatus()
	{
		return flag;
	}


	
	
	

}
