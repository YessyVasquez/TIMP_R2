package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaCategoriaDeIRFEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaCategoriaDeIRFEditarPO parametrosParaCategoriaDeIRFEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaCategoriaDeIRFEditarPO = new ParametrosParaCategoriaDeIRFEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = parametrosParaCategoriaDeIRFEditarPO.editar();
		assertTrue(sucesso, Criar);

	}
}
