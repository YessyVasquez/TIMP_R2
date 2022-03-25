package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeAtribuicaoDeCodigoCFOP.TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO;

public class TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO = new TabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tabelaDeAtribuicaoDeCodigoCFOPExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
