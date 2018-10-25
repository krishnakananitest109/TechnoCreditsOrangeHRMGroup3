package com.technocredits.orangeHRM.TestScripts;


import com.technocredits.orangeHRM.base.PredefinedMethods;
import com.technocredits.orangeHRM.pages.LoginPage;
import com.technocredits.orangeHRM.pages.PIMPages.PIM_AddEmployeeListPage;

public class CommonTest extends PredefinedMethods {

	void login(String username, String password) {
		initialization();
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("usernameTextField",username );
		loginPage.enterValueForLoginPage("passwordTextField",password );
		loginPage.clickOnLoginPage("loginButton");
	}
	
	public PIM_AddEmployeeListPage goToPIM_Add_EmployeeList(){
		//PIM_AddEmployeeListPage addemppage=new PIM_AddEmployeeListPage();
		PIM_AddEmployeeListPage PIM_AddEmployeeListPageInstance=PIM_AddEmployeeListPage.getInstance();
		
		PIM_AddEmployeeListPageInstance.goto_PIM_AddEmployeeList();
		PIM_AddEmployeeListPageInstance.navigateTo_PIM_AddEmployeeList();
		return PIM_AddEmployeeListPageInstance;
	}
	

}
