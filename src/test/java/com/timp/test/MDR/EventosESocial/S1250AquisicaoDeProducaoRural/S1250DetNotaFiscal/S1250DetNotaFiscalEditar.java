package com.timp.test.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetNotaFiscal.S1250DetNotaFiscalEditarPO;

public class S1250DetNotaFiscalEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S1250DetNotaFiscalEditarPO s1250DetNotaFiscalEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		s1250DetNotaFiscalEditarPO = new S1250DetNotaFiscalEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	

	@Test()
	public void editar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = s1250DetNotaFiscalEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
