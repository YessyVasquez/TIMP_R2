package com.timp.test.BRB;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.ExportarPO;

public class Exportar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	ExportarPO exportarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		exportarPO = new ExportarPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test(priority = 2)
	public void exportarCSV() {

		boolean sucesso = false;
		sucesso = exportarPO.exportarCSV();
		System.out.println(sucesso + "CSV");
		assertTrue(sucesso, exportação);

	}

	@Test(priority = 3)
	public void exportarXLSX() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = false;
		sucesso = exportarPO.exportaXSLX();

		System.out.println(sucesso + "XLSX");
		assertTrue(sucesso, exportação);

	}

}
