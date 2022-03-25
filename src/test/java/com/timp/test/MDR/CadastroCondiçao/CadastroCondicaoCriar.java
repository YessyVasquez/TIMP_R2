package com.timp.test.MDR.CadastroCondiçao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroCondiçao.CadastroCondicaoCriarPO;

public class CadastroCondicaoCriar extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroCondicaoCriarPO cadastroCondicaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroCondicaoCriarPO = new CadastroCondicaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean text = cadastroCondicaoCriarPO.criar();
		assertTrue(text, Criar);
		sleep(2000);

	}

}
