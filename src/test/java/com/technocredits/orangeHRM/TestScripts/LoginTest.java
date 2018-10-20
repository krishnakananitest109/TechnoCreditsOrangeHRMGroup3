package com.technocredits.orangeHRM.TestScripts;

import org.testng.annotations.Test;

public class LoginTest extends CommonTest {
	@Test
	public void dologin(){
		login("Admin","admin123");
	}

}
