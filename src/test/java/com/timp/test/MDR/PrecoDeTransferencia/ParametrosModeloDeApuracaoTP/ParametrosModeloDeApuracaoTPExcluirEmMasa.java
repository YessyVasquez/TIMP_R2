package com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModeloDeApuracaoTPExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosModeloDeApuracaoTPExcluirEmMasa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ParametrosModeloDeApuracaoTPExcluirEmMasaPO  parametrosModeloDeApuracaoTPExcluirEnMasaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		parametrosModeloDeApuracaoTPExcluirEnMasaPO = new ParametrosModeloDeApuracaoTPExcluirEmMasaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();
		
		boolean sucesso = parametrosModeloDeApuracaoTPExcluirEnMasaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMasa() {
		sleep(1000);
		boolean sucesso2 = parametrosModeloDeApuracaoTPExcluirEnMasaPO.excluirEmMasaParametrosModeloApuracaoTP();
		assertTrue(sucesso2, Eliminado);
	}
}
