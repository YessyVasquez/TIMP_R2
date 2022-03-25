package com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosCriarPO;

public class DiagnosticoDeProcessosCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DiagnosticoDeProcessosCriarPO diagnosticoDeProcessosCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		diagnosticoDeProcessosCriarPO = new DiagnosticoDeProcessosCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = diagnosticoDeProcessosCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
