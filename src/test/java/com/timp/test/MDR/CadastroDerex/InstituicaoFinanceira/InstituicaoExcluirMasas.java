package com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterClass;

public class InstituicaoExcluirMasas extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InstituicaoExcluirMasasPO instituicaoExcluirMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		instituicaoExcluirMasasPO = new InstituicaoExcluirMasasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = instituicaoExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = instituicaoExcluirMasasPO.InstituicaoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
		
		sleep(2000);
	}
}
