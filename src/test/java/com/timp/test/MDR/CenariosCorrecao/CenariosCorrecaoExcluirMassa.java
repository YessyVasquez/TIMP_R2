package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoExcluirMassaPO cenariosCorrecaoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoExcluirMassaPO = new CenariosCorrecaoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = cenariosCorrecaoExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = cenariosCorrecaoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
