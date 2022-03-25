package com.timp.test.ATR;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarATR extends TestBaseSteven {
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void ATREntrar() {

		boolean sucesso = acessarATRPO.acessarATR();
		assertTrue(sucesso, "The element is not present");

	}

}
