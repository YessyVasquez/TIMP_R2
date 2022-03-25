package com.timp.test.MDR;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

public class AcessarMDR extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;

	public AcessarMDR() {
		super();
	}

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
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

		boolean sucesso = acessarMDRPO.acessarMDR();
		assertTrue(sucesso, "The element is not present");

	}

}
