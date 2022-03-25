package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeEstoqueParaRegistro12.TabelaDeEstoqueParaRegistro12ExcluirPO;

public class TabelaDeEstoqueParaRegistro12Excluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeEstoqueParaRegistro12ExcluirPO tabelaDeEstoqueParaRegistro12ExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeEstoqueParaRegistro12ExcluirPO = new TabelaDeEstoqueParaRegistro12ExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeEstoqueParaRegistro12ExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
