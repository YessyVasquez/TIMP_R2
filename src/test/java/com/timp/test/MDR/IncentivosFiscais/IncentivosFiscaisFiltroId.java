package com.timp.test.MDR.IncentivosFiscais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos.SaldosFiltrarIdPO;
import com.sap.timp.pageObjectModel.MDR.IncentivosFiscais.IncentivosFiscaisFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class IncentivosFiscaisFiltroId extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	IncentivosFiscaisFiltroIdPO incentivosFiscaisIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		incentivosFiscaisIdPO = new IncentivosFiscaisFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void FiltrarIncentivosFiscaisId() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean dato = incentivosFiscaisIdPO.FiltrarIncentivosFiscaisId();

		assertTrue(dato, "El registro devuelto no coincide con el buscado");
	}
}
