package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.DuplicidadePO;
import com.sap.timp.pageObjectModel.BRB.EditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Duplicidade extends TestBaseSteven{

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	DuplicidadePO duplicidadePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		duplicidadePO = new DuplicidadePO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		
		boolean sucesso = duplicidadePO.editar();
		assertTrue(sucesso, Editar);

	}

}
