package com.timp.test.MDR.Siscoserv.RegistroRF;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF.RegistroRFFiltroPorIDPO;

public class RegistroRFFiltroPorID extends TestBaseSteven{
	 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroRFFiltroPorIDPO registroRFFiltroPorIDPO;
 
	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroRFFiltroPorIDPO = new RegistroRFFiltroPorIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void filtro() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroRFFiltroPorIDPO.filtro();
		assertTrue(sucesso, Filtros);
	}
  
 
}
