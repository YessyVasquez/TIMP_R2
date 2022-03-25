package com.timp.test.MDR.SCANC.RelacionamentoEntreQuadros;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros.RelacionamentoEntreQuadrosEditarPO;

public class RelacionamentoEntreQuadrosEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RelacionamentoEntreQuadrosEditarPO relacionamentoEntreQuadrosEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		relacionamentoEntreQuadrosEditarPO = new RelacionamentoEntreQuadrosEditarPO();
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

		boolean sucesso = relacionamentoEntreQuadrosEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
