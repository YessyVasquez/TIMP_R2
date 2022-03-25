package com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ObservaçoesdoDocumentoFiscalCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ObservaçoesdoDocumentoFiscalCriarPO observaçoesdoDocumentoFiscalCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observaçoesdoDocumentoFiscalCriarPO = new ObservaçoesdoDocumentoFiscalCriarPO();
	}

	@AfterClass
	public void afterClass() { 
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// observaçoesdoDocumentoFiscalCriarPO.criar();

		boolean sucesso = observaçoesdoDocumentoFiscalCriarPO.criar();
		assertTrue(sucesso, semAcesso);
	}

}
