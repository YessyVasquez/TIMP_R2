package com.timp.test.MDR.RegistroECAC;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroECAC.RegistroECACCriarPO;
import com.timp.test.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizar;

public class RegistroECACCriar extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroECACCriarPO registroECACCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroECACCriarPO = new RegistroECACCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroECACCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
