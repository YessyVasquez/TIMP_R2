package com.timp.test.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos.RegraDeCamposExcluirPO;

public class RegraDeCamposExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegraDeCamposExcluirPO regraDeCamposExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regraDeCamposExcluirPO = new RegraDeCamposExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regraDeCamposExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
