package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPExcluirPO;

public class AgrupadorDeCFOPExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AgrupadorDeCFOPExcluirPO agrupadorDeCFOPExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		agrupadorDeCFOPExcluirPO = new AgrupadorDeCFOPExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = agrupadorDeCFOPExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
