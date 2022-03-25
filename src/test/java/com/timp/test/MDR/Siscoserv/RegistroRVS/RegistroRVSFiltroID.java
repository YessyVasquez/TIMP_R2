package com.timp.test.MDR.Siscoserv.RegistroRVS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRVS.RegistroRVSFiltroIDPO;

public class RegistroRVSFiltroID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRVSFiltroIDPO registroRVSFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRVSFiltroIDPO = new RegistroRVSFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtroId() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRVSFiltroIDPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
