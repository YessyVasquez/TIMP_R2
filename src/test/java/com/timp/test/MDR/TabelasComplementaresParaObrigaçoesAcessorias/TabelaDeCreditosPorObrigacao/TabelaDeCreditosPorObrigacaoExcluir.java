package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCreditosPorObrigacao.TabelaDeCreditosPorObrigacaoExcluirPO;

public class TabelaDeCreditosPorObrigacaoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCreditosPorObrigacaoExcluirPO tabelaDeCreditosPorObrigacaoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCreditosPorObrigacaoExcluirPO = new TabelaDeCreditosPorObrigacaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeCreditosPorObrigacaoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
