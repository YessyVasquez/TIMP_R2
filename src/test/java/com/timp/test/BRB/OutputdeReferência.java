package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.OutputAutomáticoPO;
import com.sap.timp.pageObjectModel.BRB.OutputdeReferênciaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class OutputdeReferência extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	OutputdeReferênciaPO outputdeReferênciaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		outputdeReferênciaPO = new OutputdeReferênciaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void outputReferencia() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		
		boolean sucesso = outputdeReferênciaPO.outputReferencia();
		assertTrue(sucesso, Editar);

	}


}
