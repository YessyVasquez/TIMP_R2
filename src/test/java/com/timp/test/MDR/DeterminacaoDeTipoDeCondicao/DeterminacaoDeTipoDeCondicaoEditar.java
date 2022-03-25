package com.timp.test.MDR.DeterminacaoDeTipoDeCondicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoEditarPO;

public class DeterminacaoDeTipoDeCondicaoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeTipoDeCondicaoEditarPO determinacaoDeTipoDeCondicaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeTipoDeCondicaoEditarPO = new DeterminacaoDeTipoDeCondicaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoDeTipoDeCondicaoEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
