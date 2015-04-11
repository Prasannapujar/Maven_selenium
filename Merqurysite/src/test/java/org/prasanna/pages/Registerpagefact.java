package org.prasanna.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.prasanna.data.Regdata;

public class Registerpagefact extends Headers {
	
	
	

	public Registerpagefact(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@CacheLookup
	@FindBy(name="firstName")
	public WebElement efirstname;
	
	@CacheLookup
	@FindBy(name="lastName")
	public WebElement elastname;
	
	@CacheLookup
	@FindBy(name="email")
	public WebElement eusername;
	
	@CacheLookup
	@FindBy(name="password")
	public WebElement epassword;
	
	@CacheLookup
	@FindBy(name="confirmPassword")
	public WebElement ecoinfirmpassword;
	
	@CacheLookup
	@FindBy(name="register")
	public WebElement submit;
	
	@CacheLookup
	@FindBy(xpath="//font[contains(text(),'To create your account')]")
	public WebElement Registerinfo;
	
	public void enterfirstname(String firstname)
	{
		efirstname.sendKeys(firstname);
	}
	
	public void enterlastname(String firstname)
	{
		elastname.sendKeys(firstname);
	}
	
	public void enterusername(String firstname)
	{
		eusername.sendKeys(firstname);
	}
	
	public void enterpassword(String firstname)
	{
		epassword.sendKeys(firstname);
	}
	
	public void entercoinfirmpassword(String firstname)
	{
		ecoinfirmpassword.sendKeys(firstname);
	}
	
	public accountsucess submittheregister()
	{
		submit.click();
		return new accountsucess(driver);
		
	}
	
	public accountsucess regsiter1()
	{
		accountsucess s1;
		enterfirstname("Prasanna");
		System.out.println("ENtered username");
		enterlastname("pujar");
		enterusername("pup1kor");
		enterpassword("123");
		entercoinfirmpassword("123");
		s1=submittheregister();
				return s1;
	}
	
	public accountsucess regsiter1withdata(Regdata d)
	{
		accountsucess s1;
		enterfirstname(d.getFirstname());
		//System.out.println(d.);
		enterlastname(d.getLastname());
		enterusername(d.getUsername());
		enterpassword(d.getPassword());
		entercoinfirmpassword(d.getCoinfirmpassword());
		s1=submittheregister();
		return s1;
	}
	
	public String getRegisterinfotext()
	{
		return(Registerinfo.getText());
	}
	
	
	
	
	

	@Override
	public boolean Verifypage() {
		// TODO Auto-generated method stub
		return false;
	}

}
