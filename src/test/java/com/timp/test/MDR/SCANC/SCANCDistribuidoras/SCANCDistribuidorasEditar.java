package com.timp.test.MDR.SCANC.SCANCDistribuidoras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras.SCANCDistribuidorasEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SCANCDistribuidorasEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	SCANCDistribuidorasEditarPO sCANCDistribuidorasEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		sCANCDistribuidorasEditarPO = new SCANCDistribuidorasEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		accesarMDRPO.acessarMDR();

		boolean sucesso = sCANCDistribuidorasEditarPO.Editar();

		assertTrue(sucesso, Criar);

	}
}
