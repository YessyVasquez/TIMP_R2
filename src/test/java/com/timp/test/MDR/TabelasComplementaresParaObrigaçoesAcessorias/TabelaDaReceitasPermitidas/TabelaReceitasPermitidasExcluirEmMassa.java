package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDaReceitasPermitidas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas.TabelaReceitasPermitidasExcluirEmMassaPO;

public class TabelaReceitasPermitidasExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasPermitidasExcluirEmMassaPO tabelaReceitasPermitidasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasPermitidasExcluirEmMassaPO = new TabelaReceitasPermitidasExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaReceitasPermitidasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		sleep(1000);
		boolean sucesso2 = tabelaReceitasPermitidasExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
