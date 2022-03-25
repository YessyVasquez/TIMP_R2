package com.timp.test.TAA.Ajustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Ajuste.AjusteCancelarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjusteCancelar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AjusteCancelarPO ajusteCancelarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		ajusteCancelarPO = new AjusteCancelarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void ajustesCancelar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = ajusteCancelarPO.cancelar();
		assertTrue(sucesso, Criar);

	}

}
