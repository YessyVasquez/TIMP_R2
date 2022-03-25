package com.timp.test.MDR.Siscoserv.Enquadramento;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento.EnquadramentoCriarPO;

public class EnquadramentoCriar extends TestBaseSteven {

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EnquadramentoCriarPO enquadramentoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		enquadramentoCriarPO = new EnquadramentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = enquadramentoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	
}
