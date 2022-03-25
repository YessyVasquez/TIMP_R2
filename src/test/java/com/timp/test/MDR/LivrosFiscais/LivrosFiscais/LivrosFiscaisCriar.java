package com.timp.test.MDR.LivrosFiscais.LivrosFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;

public class LivrosFiscaisCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LivrosFiscaisCriarPO livrosFiscaisCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		livrosFiscaisCriarPO = new LivrosFiscaisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	

	@Test()
	public void criar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = livrosFiscaisCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
