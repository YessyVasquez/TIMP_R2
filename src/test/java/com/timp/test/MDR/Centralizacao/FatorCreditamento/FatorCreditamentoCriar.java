package com.timp.test.MDR.Centralizacao.FatorCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorCreditamentoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatorCreditamentoCriarPO fatorCreditamentoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		fatorCreditamentoCriarPO = new FatorCreditamentoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = fatorCreditamentoCriarPO.fatorCreditamentoCriar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
}
