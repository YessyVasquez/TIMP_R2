package com.timp.test.MDR.Siscoserv.RegistroRAS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRAS.RegistroRASFiltroIDPO;

public class RegistroRASFiltroID extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRASFiltroIDPO registroRASFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRASFiltroIDPO = new RegistroRASFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtroId() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = registroRASFiltroIDPO.filtro();

		assertTrue(sucesso, Filtros);

	}
	
}
