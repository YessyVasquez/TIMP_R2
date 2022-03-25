package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldoInicialCriar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialCriarPO saldoIncialCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoIncialCriarPO = new SaldoInicialCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void CriarSaldoInicial() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = saldoIncialCriarPO.CriarSaldoInicial();

		assertTrue(sucesso, Criar);

	}
}
