package com.timp.test.MDR.CEP.Logradouro;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class LogradouroFiltros extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LogradouroFiltrosPO logradouroFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		logradouroFiltrosPO = new LogradouroFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtros() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = logradouroFiltrosPO.logradouroFiltros();
		assertTrue(sucesso, Filtros);
		sleep(2000);
	}
}
