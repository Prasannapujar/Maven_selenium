package org.prasanna.test;



import org.openqa.selenium.support.PageFactory;
import org.prasanna.pages.Registerpagefact;
import org.prasanna.util.Customverification;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestRegistertext extends Selbasetest{
	
	@Test
	public void Testregistertext()
	{   
		String expected="zTo create your account, we'll need some basic information about you. This information will be used to send reservation confirmation emails, mail tickets when needed and contact you if your travel arrangements change. Please fill in the form completely.";
		
		Customverification v=new Customverification();
		Reporter.log("TestRgister Test cases"+"<br>");
		Registerpagefact p=PageFactory.initElements(d,Registerpagefact.class);
	    v.checkifequal("Verify Rgister Text", expected, p.getRegisterinfotext());
	    Boolean f=v.Returnstatus();
	    if(!f.booleanValue())
	    {
	    	System.out.println("failed");
	    }
	}

}
