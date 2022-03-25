package com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosExcluirPO;

public class DiagnosticoDeProcessosExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DiagnosticoDeProcessosExcluirPO diagnosticoDeProcessosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		diagnosticoDeProcessosExcluirPO = new DiagnosticoDeProcessosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = diagnosticoDeProcessosExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
