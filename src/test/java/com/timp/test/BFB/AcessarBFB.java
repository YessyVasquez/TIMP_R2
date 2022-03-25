package com.timp.test.BFB;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BFB.AcessarBFBPO;

public class AcessarBFB extends TestBaseFernando {
	
	LoginTC loginTC;
	AcessarBFBPO acessarBFBPO;

	public AcessarBFB() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarBFBPO = new AcessarBFBPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void MDREntrar() {
		boolean sucesso = acessarBFBPO.acessarBFB();
		assertTrue(sucesso, "Elemento não Econtrado");
	}
}
