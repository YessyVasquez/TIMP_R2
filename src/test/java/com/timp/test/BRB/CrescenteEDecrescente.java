package com.timp.test.BRB;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.CrescenteEDecrescentePO;

public class CrescenteEDecrescente extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	CrescenteEDecrescentePO crescenteEDecrescentePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		crescenteEDecrescentePO = new CrescenteEDecrescentePO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void crescenteEDecrescente() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		ArrayList<Boolean> sucesso = crescenteEDecrescentePO.crescente();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), crescenteEDecrescente);
		}
		System.out.println(sucesso);

		ArrayList<Boolean> sucesso2 = crescenteEDecrescentePO.decrescente();

		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), crescenteEDecrescente);
		}
		System.out.println(sucesso2);
		sleep(2000);
	}

}
