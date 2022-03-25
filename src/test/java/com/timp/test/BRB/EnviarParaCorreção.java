package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.AtribuiçãodeRegraPO;
import com.sap.timp.pageObjectModel.BRB.EnviarParaCorreçãoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EnviarParaCorreção extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EnviarParaCorreçãoPO enviarParaCorreçãoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		enviarParaCorreçãoPO = new EnviarParaCorreçãoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = enviarParaCorreçãoPO.editar();
		assertTrue(sucesso, Editar);

	}

}
