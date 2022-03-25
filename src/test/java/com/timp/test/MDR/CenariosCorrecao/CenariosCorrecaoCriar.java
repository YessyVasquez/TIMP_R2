package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoCriarPO cenariosCorrecaoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoCriarPO = new CenariosCorrecaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = cenariosCorrecaoCriarPO.cenariosCorrecaoCriar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

}
