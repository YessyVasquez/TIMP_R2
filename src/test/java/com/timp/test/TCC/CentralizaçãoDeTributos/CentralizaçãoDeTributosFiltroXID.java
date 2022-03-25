package com.timp.test.TCC.CentralizaçãoDeTributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltroXIDPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltrosAvançadosPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class CentralizaçãoDeTributosFiltroXID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	CentralizaçãoDeTributosFiltroXIDPO centralizaçãoDeTributosFiltroXIDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centralizaçãoDeTributosFiltroXIDPO = new CentralizaçãoDeTributosFiltroXIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()

	public void Filtro() {
		loginTC.login();
		acessarTCCPO.acessarTCC();

		centralizaçãoDeTributosFiltroXIDPO.Filtros();

	}
}
