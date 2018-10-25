package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRM.Util.PropertyFileReader;
import com.technocredits.orangeHRM.base.PredefinedMethods;

public class LoginPage extends PredefinedMethods {

	static LoginPage loginPage;
	Properties loginPageProperties;

	private LoginPage() {

		//initialization();
		PropertyFileReader propReader = new PropertyFileReader();
		loginPageProperties = propReader.initalizePropertyFile("LoginPageProperties");

	}

	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}

	public void enterValueForLoginPage(String locator, String value) {
		SetText(loginPageProperties.getProperty(locator),value);

	}

	public void clickOnLoginPage(String locator) {
		Click(loginPageProperties.getProperty(locator));

	}

}
