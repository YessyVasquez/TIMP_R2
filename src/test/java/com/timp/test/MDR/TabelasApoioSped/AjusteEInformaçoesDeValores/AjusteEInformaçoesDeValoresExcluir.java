package com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjusteEInformaçoesDeValoresExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInformaçoesDeValoresExcluirPO ajusteEInformaçoesDeValoresExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInformaçoesDeValoresExcluirPO = new AjusteEInformaçoesDeValoresExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = ajusteEInformaçoesDeValoresExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
