package com.timp.test.TAA.Ajustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Ajuste.AjustesEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;

public class AjustesEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AjustesEditarPO ajustesEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		ajustesEditarPO = new AjustesEditarPO();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
	

	@Test()
	public void editar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = ajustesEditarPO.editar();
		assertTrue(sucesso, Criar);

	}

}
