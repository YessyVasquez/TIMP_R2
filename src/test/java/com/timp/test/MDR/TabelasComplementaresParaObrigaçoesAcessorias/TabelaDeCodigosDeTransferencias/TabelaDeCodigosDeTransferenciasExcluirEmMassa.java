package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigosDeTransferencias.TabelaDeCodigosDeTransferenciasExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaDeCodigosDeTransferenciasExcluirEmMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	TabelaDeCodigosDeTransferenciasExcluirEmMassaPO tabelaDeCodigosDeTransferenciasExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		tabelaDeCodigosDeTransferenciasExcluirEmMassaPO = new TabelaDeCodigosDeTransferenciasExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = tabelaDeCodigosDeTransferenciasExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = tabelaDeCodigosDeTransferenciasExcluirEmMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
