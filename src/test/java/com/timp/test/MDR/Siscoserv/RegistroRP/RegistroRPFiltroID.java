package com.timp.test.MDR.Siscoserv.RegistroRP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRP.RegistroRPFiltroIDPO;

public class RegistroRPFiltroID extends TestBaseSteven{
  
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRPFiltroIDPO registroRPFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRPFiltroIDPO = new RegistroRPFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtroId() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRPFiltroIDPO.filtro();

		assertTrue(sucesso, Filtros);

	}
	
}
