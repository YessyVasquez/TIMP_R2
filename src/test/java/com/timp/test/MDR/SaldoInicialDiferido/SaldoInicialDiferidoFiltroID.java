package com.timp.test.MDR.SaldoInicialDiferido;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoCriarPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido.SaldoInicialDiferidoFiltroIDPO;

public class SaldoInicialDiferidoFiltroID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialDiferidoFiltroIDPO saldoInicialDiferidoFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialDiferidoFiltroIDPO = new SaldoInicialDiferidoFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = saldoInicialDiferidoFiltroIDPO.filtro();
		assertTrue(sucesso, semAcesso);

	}

}
