package com.timp.test.TCC.FatorDeCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltrosAvançadosPO;
import com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento.FatorDeCreditamentoFiltrosAvançadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoFiltrosAvançados extends TestBaseSteven{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	FatorDeCreditamentoFiltrosAvançadosPO fatorDeCreditamentoFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		fatorDeCreditamentoFiltrosAvançadosPO = new FatorDeCreditamentoFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = fatorDeCreditamentoFiltrosAvançadosPO.Filtros();
		assertTrue(sucesso, Filtros);
	}
}
