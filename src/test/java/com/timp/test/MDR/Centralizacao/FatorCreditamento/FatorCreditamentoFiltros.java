package com.timp.test.MDR.Centralizacao.FatorCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorCreditamentoFiltros extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatorCreditamentoFiltrosPO fatorCreditamentoFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		fatorCreditamentoFiltrosPO = new FatorCreditamentoFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void filtros() {
		

			
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = fatorCreditamentoFiltrosPO.fatorCrecimentoFiltros();
		assertTrue(sucesso, Filtros);
		sleep(2000);
	}

}
