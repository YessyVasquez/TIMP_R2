package com.timp.test.BRB;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.*;

public class CampoOutput extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	CampoOutputPO campoOutputPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		campoOutputPO = new CampoOutputPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void campoOutput() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = campoOutputPO.agregarOutput();
		System.out.println(sucesso);

		assertTrue(sucesso, semCampoOutput);
		sleep(2000);
	}

}
