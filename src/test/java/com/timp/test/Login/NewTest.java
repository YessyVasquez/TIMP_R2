package com.timp.test.Login;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.login.LoginPO;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest extends TestBase{
	
	LoginPO loginPO;
	
	@Test(priority = 1)
	public void login() {
		loginPO.verificarLogin();

	}

	@BeforeTest
	public void beforeTest() {
		initialization();
		loginPO = new LoginPO();
	}

	@AfterTest
	public void afterTest() {
	}

}
