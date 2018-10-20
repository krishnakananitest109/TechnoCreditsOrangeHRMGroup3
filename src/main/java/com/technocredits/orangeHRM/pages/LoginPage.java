package com.technocredits.orangeHRM.Pages;

import java.util.Properties;
import com.technocredits.orangeHRM.Base.PredefinedMethods;
import com.technocredits.orangeHRM.Util.PropertyFileReader;

public class LoginPage extends PredefinedMethods{
	static LoginPage loginpageInstance;
	Properties loginPageProperties;
	private LoginPage(){
		initialization();
		PropertyFileReader propReader = new PropertyFileReader();
		loginPageProperties = propReader.initalizePropertyFile("LoginPageProperties");
	}
	
	static public LoginPage getInstance() 
	{
		if(loginpageInstance == null){
			loginpageInstance = new LoginPage();
		}
		return loginpageInstance;
	}
	
	public void enterValueForLoginPage(String locator, String value){
		setText(loginPageProperties.getProperty(locator),value);
	}
	
	public void clickOnLoginPage(String locator){
		click(loginPageProperties.getProperty(locator));
	}	
}
