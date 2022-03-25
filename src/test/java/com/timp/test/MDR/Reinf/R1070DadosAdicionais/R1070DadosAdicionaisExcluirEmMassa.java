package com.timp.test.MDR.Reinf.R1070DadosAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais.ProcessosAdmJudiciaisExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class R1070DadosAdicionaisExcluirEmMassa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosAdicionaisExcluirEmMassaPO r1070DadosAdicionaisExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosAdicionaisExcluirEmMassaPO = new R1070DadosAdicionaisExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = r1070DadosAdicionaisExcluirEmMassaPO.Criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		sleep(1000);
		boolean sucesso2 = r1070DadosAdicionaisExcluirEmMassaPO.excluirEmMassa();
		assertTrue(sucesso2, Eliminado);

	}

}
