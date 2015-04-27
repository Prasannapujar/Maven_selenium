package org.prasanna.test;

import org.prasanna.pages.Businesstravelpage;
import org.prasanna.pages.Headers;
import org.prasanna.pages.Home;
import org.prasanna.pages.Register;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testopeningofbussinesstravel extends Selbasetest {

	
	@Test(testName="Testopeningofbussinesstravel")
	public void testtile()
	{
		Register r=new Register(d);
		Home h=r.clickonHome(); // navigating to home page
		Businesstravelpage b=h.clickonbusinesstravellink(); // 
		Assert.assertEquals(d.getTitle(), "Business Travel - Advice, Product Reviews, and Articles");
		b.closeBusinesstravelpage();
		b.switchtoprevioushandle();
	}
}
