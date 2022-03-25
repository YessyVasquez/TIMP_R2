package com.timp.test.MDR.Siscoserv.PaisMoeda;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda.PaisMoedaEditarPO;

public class PaisMoedaEditar extends TestBaseSteven {

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	PaisMoedaEditarPO paisMoedaEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		paisMoedaEditarPO = new PaisMoedaEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = paisMoedaEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
