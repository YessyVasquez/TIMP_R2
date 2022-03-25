package com.timp.test.MDR.Siscoserv.NBS;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.NBS.NBSEditarPO;

public class NBSEditar extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	NBSEditarPO nbsEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		nbsEditarPO = new NBSEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = nbsEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
