package com.timp.test.BRB;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.PublicoYPRivadoPO;

public class PublicoEPrivado extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	PublicoYPRivadoPO publicoYPRivadoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		publicoYPRivadoPO = new PublicoYPRivadoPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void publicoYPRivado() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();


		boolean publicoEditor = publicoYPRivadoPO.publicoEditor();
		System.out.println(publicoEditor);
		assertTrue(publicoEditor, compartilharE);

		boolean privadoEditor = publicoYPRivadoPO.privadoEditor();
		System.out.println(privadoEditor);
		assertTrue(privadoEditor, descompartilharE);

		boolean publicoBiblioteca = publicoYPRivadoPO.publicoBiblioteca();
		System.out.println(publicoBiblioteca);
		assertTrue(publicoBiblioteca, compartilharB);

		boolean privadoBiblioteca = publicoYPRivadoPO.privadoBiblioteca();
		System.out.println(privadoBiblioteca);
		assertTrue(privadoBiblioteca, descompartilharB);

	}

}
