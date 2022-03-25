package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtribuiçãodeRegraPO;
import com.sap.timp.pageObjectModel.BRB.DuplicidadePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtribuiçãodeRegra extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	AtribuiçãodeRegraPO atribuiçãodeRegraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		atribuiçãodeRegraPO = new AtribuiçãodeRegraPO();

	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}


	@Test()
	public void editar() {		
		loginTC.login();		
		acessarBrbPO.acessar();		

		boolean sucesso = atribuiçãodeRegraPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);
	}
}
