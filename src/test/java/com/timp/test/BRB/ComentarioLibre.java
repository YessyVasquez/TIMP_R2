package com.timp.test.BRB;


import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ComentarioLibrePO;

public class ComentarioLibre extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ComentarioLibrePO comentarioLibrePO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		comentarioLibrePO = new ComentarioLibrePO();

	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}



	@Test()
	public void comentarioLibre() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		
		ArrayList<Boolean> sucesso = comentarioLibrePO.aplicarComentarioLibre();
		System.out.println(sucesso);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), comentarioNãoValido);
		}
		sleep(2000);
	}

}
