package com.timp.test.BRB;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ImprimirPO;

public class Imprimir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ImprimirPO imprimirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		imprimirPO = new ImprimirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void imprimir() {
		
		
		loginTC.login();
		
		acessarBrbPO.acessar();

		
		imprimirPO.imprimir();
	}

}
