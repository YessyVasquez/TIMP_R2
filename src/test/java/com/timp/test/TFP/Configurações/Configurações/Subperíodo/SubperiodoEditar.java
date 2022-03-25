package com.timp.test.TFP.Configurações.Configurações.Subperíodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Subperíodo.SubperiodoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SubperiodoEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubperiodoEditarPO subperiodoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subperiodoEditarPO = new SubperiodoEditarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void Editar() {

		loginTC.login();
		acessarTFPPO.acessarTFP();
		boolean sucesso = subperiodoEditarPO.editar();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Editar);
	}

}
