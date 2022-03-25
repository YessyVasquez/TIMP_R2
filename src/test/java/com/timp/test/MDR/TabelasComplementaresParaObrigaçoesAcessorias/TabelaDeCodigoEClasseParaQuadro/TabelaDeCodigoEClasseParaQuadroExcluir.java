package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaDeCodigoEClasseParaQuadro.TabelaDeCodigoEClasseParaQuadroExcluirPO;

public class TabelaDeCodigoEClasseParaQuadroExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeCodigoEClasseParaQuadroExcluirPO tabelaDeCodigoEClasseParaQuadroExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeCodigoEClasseParaQuadroExcluirPO = new TabelaDeCodigoEClasseParaQuadroExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = tabelaDeCodigoEClasseParaQuadroExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
