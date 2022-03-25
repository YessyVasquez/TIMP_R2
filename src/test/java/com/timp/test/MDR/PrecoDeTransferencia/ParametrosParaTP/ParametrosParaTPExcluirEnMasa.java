package com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPExcluirEnMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaTPExcluirEnMasa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ParametrosParaTPExcluirEnMasaPO  parametrosParaTPExcluirEnMasaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		parametrosParaTPExcluirEnMasaPO = new ParametrosParaTPExcluirEnMasaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDR.acessarMDR();

		boolean sucesso = parametrosParaTPExcluirEnMasaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMasa() {
		sleep(1000);
		boolean sucesso2 = parametrosParaTPExcluirEnMasaPO.excluirEmMasaParametrosParaTP();
		assertTrue(sucesso2, Eliminado);
	}

}
