package com.timp.test.BRB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.FiltrosAvanazadosPO;
import com.sap.timp.pageObjectModel.BRB.PaginacionPO;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FiltrosAvancados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FiltrosAvanazadosPO filtrosAvanazadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		filtrosAvanazadosPO = new FiltrosAvanazadosPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtrosAvanzados() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		ArrayList<String> datos = new ArrayList<String>();

		datos = (ArrayList<String>) filtrosAvanazadosPO.filtro();
		System.out.println(datos);

		for (int i = 0; i < datos.size(); i++) {

			assertEquals(datos.get(i), "Relatório Dinâmico");
		}

	}

}
