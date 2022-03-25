package com.timp.test.MDR.TabelaDeApoioECF;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF.TabelaDeApoioECFCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF.TabelaDeApoioECFEditarPO;

public class TabelaDeApoioECFEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeApoioECFEditarPO tabelaDeApoioECFEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeApoioECFEditarPO = new TabelaDeApoioECFEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	/*
	 * @Test(priority = 0) public void login() { loginTC.login();
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void acessarMDR() {
	 * 
	 * acessarMDRPO.acessarMDR();
	 * 
	 * }
	 */

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeApoioECFEditarPO.editar();
		assertTrue(sucesso, semAcesso);

	}

}