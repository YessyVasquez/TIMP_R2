package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoExcluirPO cenariosCorrecaoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoExcluirPO = new CenariosCorrecaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}


	@Test()
	public void excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = cenariosCorrecaoExcluirPO.cenariosCorrecaoExcluir();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}

}
