package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeDetalhamentosParaRegistro10.TabelaDeDetalhamentosParaRegistro10CriarPO;

public class TabelaDeDetalhamentosParaRegistro10Criar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeDetalhamentosParaRegistro10CriarPO tabelaDeDetalhamentosParaRegistro10CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeDetalhamentosParaRegistro10CriarPO = new TabelaDeDetalhamentosParaRegistro10CriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeDetalhamentosParaRegistro10CriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
