package com.timp.test.MDR.Centralizacao.Saldos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos.SaldosFiltrarIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldosFiltrarId extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldosFiltrarIdPO saldosFiltrarIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldosFiltrarIdPO = new SaldosFiltrarIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void FiltrarSaldosId() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean dato = saldosFiltrarIdPO.FiltrarSaldosId();

		assertTrue(dato, "El registro devuelto no coincide con el buscado");
		sleep(2000);
	}
}
