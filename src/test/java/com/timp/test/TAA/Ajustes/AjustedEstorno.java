package com.timp.test.TAA.Ajustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Ajuste.AjustedEstornoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjustedEstorno extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	AjustedEstornoPO ajustedEstornoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		ajustedEstornoPO = new AjustedEstornoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void ajustesEstorno() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = ajustedEstornoPO.estorno();
		assertTrue(sucesso, Criar);

	}
}
