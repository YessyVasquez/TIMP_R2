package com.timp.test.MDR.TabelaDeApoioECF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF.TabelaDeApoioECFExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaDeApoioECFExcluirMasas extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeApoioECFExcluirMasasPO tabelaDeApoioECFExcluirMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeApoioECFExcluirMasasPO = new TabelaDeApoioECFExcluirMasasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tabelaDeApoioECFExcluirMasasPO.Criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void ExcluirEmMassa() {

		boolean sucesso2 = tabelaDeApoioECFExcluirMasasPO.ExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}
}
