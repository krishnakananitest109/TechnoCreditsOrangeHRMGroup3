package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.Pages.LoginPage;

public class CommonTest {

	
	public void login(String username,String password){
		LoginPage loginpageInstance = LoginPage.getInstance();
		loginpageInstance.enterValueForLoginPage("usernameTextField", username);
		loginpageInstance.enterValueForLoginPage("passwordTextField", password);
		loginpageInstance.clickOnLoginPage("loginbutton");
	}
}
