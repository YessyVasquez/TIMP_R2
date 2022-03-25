package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;

public class ParametrosParaLivroICMSSTCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTCriarPO parametrosParaLivroICMSSTCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaLivroICMSSTCriarPO = new ParametrosParaLivroICMSSTCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	
	}


	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = parametrosParaLivroICMSSTCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
	

}
