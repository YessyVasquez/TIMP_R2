package com.timp.test.TCC.CentralizaçãoDeTributos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltrosAvançadosPO;

public class CentralizaçãoDeTributosFiltrosAvançados extends TestBaseSteven{

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	CentralizaçãoDeTributosFiltrosAvançadosPO centralizaçãoDeTributosFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centralizaçãoDeTributosFiltrosAvançadosPO = new CentralizaçãoDeTributosFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()

	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();

		centralizaçãoDeTributosFiltrosAvançadosPO.Filtros();
	}
}
