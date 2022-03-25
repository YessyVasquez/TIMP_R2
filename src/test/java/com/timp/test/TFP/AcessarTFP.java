package com.timp.test.TFP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarTFP extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void TFPEntrar() {

		boolean sucesso = acessarTFPPO.acessarTFP();
		assertTrue(sucesso, "The element is not present");

	}

}
