package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeisCriar extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoFatosContabeisCriarPO ecd;

	public CodigoFatosContabeisCriar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		ecd = new CodigoFatosContabeisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		boolean sucesso3 = acesarMDRPO.acessarMDR();
		assertTrue(sucesso3, "The element is not present");

		boolean sucesso2 = ecd.criar();
		assertTrue(sucesso2, "There is an error...");
	}

}