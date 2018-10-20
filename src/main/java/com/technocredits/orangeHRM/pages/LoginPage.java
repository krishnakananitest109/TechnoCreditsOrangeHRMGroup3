package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRM.base.Predefinedmethods;
import com.technocredits.orangeHRM.util.PropertyReader;


public class LoginPage extends Predefinedmethods {

	private static LoginPage loginPage;
	Properties loginPageProperties;

	private LoginPage()
	{
		initialization();
		PropertyReader propReader = new PropertyReader();
		loginPageProperties = propReader.initalizePropertyFile("LoginPageProperties");
	
	}

	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}
	public void enterValueForLoginPage(String locator, String value){
		setText(loginPageProperties.getProperty(locator),value);
	}
	
	public void clickOnLoginPage(String locator){
		click(loginPageProperties.getProperty(locator));
	}	
}

