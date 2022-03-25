package com.timp.test.MDR.Siscoserv.PaisMoeda;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda.PaisMoedaCriarPO;

public class PaisMoedaCriar extends TestBaseSteven {

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	PaisMoedaCriarPO paisMoedaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		paisMoedaCriarPO = new PaisMoedaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = paisMoedaCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}
}
