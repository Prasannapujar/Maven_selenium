package org.prasanna.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.prasanna.data.Regdata;
import org.prasanna.pages.Registerpagefact;
import org.prasanna.util.Customverification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registertestfact extends Selbasetest {
	
	@Test
	public void testregister()
	{
		Customverification c=new Customverification();
		Registerpagefact p=PageFactory.initElements(d, Registerpagefact.class);
		p.regsiter1();
		Assert.fail();
	}

	@Test(dataProvider="regdata",dataProviderClass=Regdata.class)
	public void testwithdataprovider(Regdata d1)
	{
		Registerpagefact p=PageFactory.initElements(d, Registerpagefact.class);
		p.regsiter1withdata(d1);
		
	}
	
	
	@Test(dataProvider="readcsv",dataProviderClass=Regdata.class)
	public void testwithcsvcreated(Regdata d1)
	{
		Registerpagefact p=PageFactory.initElements(d, Registerpagefact.class);
		p.regsiter1withdata(d1);
	}
}
