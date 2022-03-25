package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro11.TabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO;

public class TabelaDeDetalhamentosParaRegistro11ExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO tabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO = new TabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}

	@Test(dependsOnMethods = "criar")
	public void excluriEmMassa() {
		sleep(1000);
		boolean sucesso2 = tabelaDeDetalhamentosParaRegistro11ExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
