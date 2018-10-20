package com.technocredits.orangeHRM.TestScripts;


import com.technocredits.orangeHRM.pages.LoginPage;

public class CommonTest {

	void login(String username, String password) {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("usernameTextField",username );
		loginPage.enterValueForLoginPage("passwordTextField",password );
		loginPage.clickOnLoginPage("loginButton");
	}

}
