package com.timp.test.MDR.Siscoserv.RegistroRAS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRAS.RegistroRASCriarPO;

public class RegistroRASCriar extends TestBaseSteven{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRASCriarPO registroRASCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRASCriarPO = new RegistroRASCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = registroRASCriarPO.criar();
		assertTrue(sucesso, semAcesso);
	}
}
