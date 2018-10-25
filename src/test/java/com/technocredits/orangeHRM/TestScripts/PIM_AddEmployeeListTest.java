package com.technocredits.orangeHRM.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.technocredits.orangeHRM.pages.PIMPages.PIM_AddEmployeeListPage;

public class PIM_AddEmployeeListTest extends CommonTest{
	@Test
	public void verifyNavigatePIMAddEmployeePage() throws InterruptedException{
		login("Admin","admin123");
		PIM_AddEmployeeListPage PIM_AddEmployeeListPageInstance=goToPIM_Add_EmployeeList();
		String actualURL=PIM_AddEmployeeListPageInstance.getURL();
		
		String expected="https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee";
		PIM_AddEmployeeListPageInstance.expandMenu("locator");
	
		Assert.assertEquals(actualURL, expected);
		
		
	}

}
