package com.timp.test.MDR.TabelasApoioSped.DocumentosFiscaisICMS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS.DocumentosFiscaisICMSCriarPO;

public class DocumentosFiscaisICMSCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO; 
	DocumentosFiscaisICMSCriarPO documentosFiscaisICMSCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		documentosFiscaisICMSCriarPO = new DocumentosFiscaisICMSCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = documentosFiscaisICMSCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
