package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldoInicialEditar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialEditarPO saldoInicialEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialEditarPO = new SaldoInicialEditarPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editarSaldo() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = saldoInicialEditarPO.editarSaldoInicial();
		assertTrue(sucesso, Editar);

	}

}
