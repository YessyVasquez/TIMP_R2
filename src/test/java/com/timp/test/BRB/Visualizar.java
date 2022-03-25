package com.timp.test.BRB;


import static org.testng.Assert.assertFalse;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.VisualizarPO;

public class Visualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	VisualizarPO visualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		visualizarPO = new VisualizarPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();


		boolean sucesso = true;
		sucesso = visualizarPO.visualizar();
		System.out.println(sucesso);

		assertFalse(sucesso, visualizaçar);

	}

}
