package com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosExcluirEmMassaPO;

public class DiagnosticoDeProcessosExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DiagnosticoDeProcessosExcluirEmMassaPO diagnosticoDeProcessosExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		diagnosticoDeProcessosExcluirEmMassaPO = new DiagnosticoDeProcessosExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = diagnosticoDeProcessosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = diagnosticoDeProcessosExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
