package com.timp.test.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal.ObservaçoesdoDocumentoFiscalEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ObservaçoesdoDocumentoFiscalEditar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ObservaçoesdoDocumentoFiscalEditarPO observaçoesdoDocumentoFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM(); 
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		observaçoesdoDocumentoFiscalEditarPO = new ObservaçoesdoDocumentoFiscalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// observaçoesdoDocumentoFiscalEditarPO.editar();
		boolean sucesso = observaçoesdoDocumentoFiscalEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
