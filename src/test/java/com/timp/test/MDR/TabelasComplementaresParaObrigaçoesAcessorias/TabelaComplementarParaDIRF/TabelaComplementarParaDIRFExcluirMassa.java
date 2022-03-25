package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF.TabelaComplementarParaDIRFExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaComplementarParaDIRFExcluirMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaComplementarParaDIRFExcluirMassaPO tabelaComplementarParaDIRFExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaComplementarParaDIRFExcluirMassaPO = new TabelaComplementarParaDIRFExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaComplementarParaDIRFExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = tabelaComplementarParaDIRFExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
