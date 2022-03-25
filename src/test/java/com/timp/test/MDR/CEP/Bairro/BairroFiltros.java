package com.timp.test.MDR.CEP.Bairro;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroFiltrosPO;

public class BairroFiltros extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	BairroFiltrosPO bairroFiltrosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		bairroFiltrosPO = new BairroFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void filtro() {
		
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = bairroFiltrosPO.filtro();

		assertTrue(sucesso, Filtros);
		sleep(2000);
	}

}
