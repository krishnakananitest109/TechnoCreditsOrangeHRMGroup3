package com.technocredits.orangeHRM.pages.PIMPages;

import com.technocredits.orangeHRM.Util.PropertyFileReader;
import com.technocredits.orangeHRM.base.PredefinedMethods;
import com.technocredits.orangeHRM.pages.LoginPage;

public class PIM_AddEmployeeListPage extends PredefinedMethods {
	static PIM_AddEmployeeListPage PIM_AddEmployeeListPageInstance;
	
	private PIM_AddEmployeeListPage() {

		//PropertyFileReader propReader = new PropertyFileReader();
		// = propReader.initalizePropertyFile("LoginPageProperties");
		
	}

	public static PIM_AddEmployeeListPage getInstance() {
		if (PIM_AddEmployeeListPageInstance == null)
			PIM_AddEmployeeListPageInstance = new PIM_AddEmployeeListPage();
		return PIM_AddEmployeeListPageInstance;
	}
	
	public String navigateTo_PIM_AddEmployeeList(){
		return getURL();
	}
	public  void goto_PIM_AddEmployeeList(){
		expandMenu("//a[@id='menu_pim_viewPimModule']");
		Click("//a[@id='menu_pim_addEmployee']");
	}
}
