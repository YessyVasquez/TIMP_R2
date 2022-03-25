package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12ExcluirEmMassaPO;

public class TabelaDeEstoqueParaRegistro12ExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeEstoqueParaRegistro12ExcluirEmMassaPO tabelaDeEstoqueParaRegistro12ExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeEstoqueParaRegistro12ExcluirEmMassaPO = new TabelaDeEstoqueParaRegistro12ExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeEstoqueParaRegistro12ExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		sleep(1000);
		boolean sucesso2 = tabelaDeEstoqueParaRegistro12ExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
	}
}
