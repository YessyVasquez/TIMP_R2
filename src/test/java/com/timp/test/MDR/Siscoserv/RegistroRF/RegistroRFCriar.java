package com.timp.test.MDR.Siscoserv.RegistroRF;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF.RegistroRFCriarPO;


public class RegistroRFCriar extends TestBaseMassiel {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRFCriarPO registroRFCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRFCriarPO = new RegistroRFCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()

	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRFCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	
 
}
