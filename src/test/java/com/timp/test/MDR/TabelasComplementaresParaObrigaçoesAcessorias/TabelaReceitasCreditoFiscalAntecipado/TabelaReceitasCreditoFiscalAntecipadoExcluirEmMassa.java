package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado.TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO;

public class TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO = new TabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		sleep(1000);
		boolean sucesso2 = tabelaReceitasCreditoFiscalAntecipadoExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}

}
