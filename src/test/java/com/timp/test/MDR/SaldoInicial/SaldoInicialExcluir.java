package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialCriarPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldoInicialExcluir extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialExcluirPO saldoInicialExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialExcluirPO = new SaldoInicialExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void ExcluirSaldoInicial() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = saldoInicialExcluirPO.ExcluirSaldoInicial();

		assertTrue(sucesso, Eliminado);
	}
}
