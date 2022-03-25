package com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPCriarPO;

public class ParametrosParaTPCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaTPCriarPO parametrosParaTPCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaTPCriarPO = new ParametrosParaTPCriarPO();
	}

	@AfterClass
	public void afterClass() {

		//driver.close();

	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = parametrosParaTPCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
