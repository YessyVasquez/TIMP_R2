package com.timp.test.BRB;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.CriarCopiaPO;
import com.sap.timp.pageObjectModel.BRB.EliminarPO;

public class ExcluirRelatorio extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	EliminarPO eliminarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		eliminarPO = new EliminarPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void eliminar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		
		
		boolean sucesso = eliminarPO.eliminar();

		assertTrue(sucesso, eliminar);

	}

	@Test(dependsOnMethods = "eliminar")
	public void eliminarLixeira() {

		boolean sucesso = eliminarPO.eliminarLixeira();
		System.out.println(sucesso);
		assertTrue(sucesso, eliminar);

	}

}
