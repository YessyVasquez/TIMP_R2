package com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroNotaFiscalExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CadastroNotaFiscalExcluirEmMassaPO cadastroNotaFiscalExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		cadastroNotaFiscalExcluirEmMassaPO = new CadastroNotaFiscalExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Criar() {

		loginTC.login();
		accesarMDR.acessarMDR();
		boolean sucesso = cadastroNotaFiscalExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}

	@Test(dependsOnMethods = "Criar")
	public void ExcluirEmMassa() {

		boolean sucesso2 = cadastroNotaFiscalExcluirEmMassaPO.cadastroNotaFiscalExcluirEmMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
