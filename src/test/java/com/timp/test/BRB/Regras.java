package com.timp.test.BRB;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.RegrasPO;

public class Regras extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	RegrasPO regrasPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		regrasPO = new RegrasPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void regras() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();


		boolean sucesso = regrasPO.regra();
		System.out.println(sucesso);

		assertTrue(sucesso, "The Rules don't match");

	}

}
