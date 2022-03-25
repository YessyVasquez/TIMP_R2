package com.timp.test.TAA.Ajustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Ajuste.AjustedCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjustesCriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AjustedCriarPO ajustedCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		ajustedCriarPO = new AjustedCriarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void ajustesCriar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = ajustedCriarPO.criar();
		assertTrue(sucesso, Criar);

	}

}
