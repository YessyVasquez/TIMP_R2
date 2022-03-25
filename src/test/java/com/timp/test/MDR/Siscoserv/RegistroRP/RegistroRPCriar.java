package com.timp.test.MDR.Siscoserv.RegistroRP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRP.RegistroRPCriarPO;

public class RegistroRPCriar extends TestBaseSteven {
	 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRPCriarPO registroRPCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRPCriarPO = new RegistroRPCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRPCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	
 
}
