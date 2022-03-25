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
import com.sap.timp.pageObjectModel.BRB.GruposAvanzadosPO;

public class GruposAvancados extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	GruposAvanzadosPO gruposAvanzadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		gruposAvanzadosPO = new GruposAvanzadosPO();

	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void gruposAvanzados() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();

		gruposAvanzadosPO.gruposAvanzadosAplicar();

		ArrayList<Boolean> sucesso1 = new ArrayList<Boolean>();
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();

		sucesso1 = gruposAvanzadosPO.igual();
		for (int i = 0; i < sucesso1.size(); i++) {
			assertTrue(sucesso1.get(i), gruposAvan);
		}
		System.out.println(sucesso1);

		sleep(2000);
		sucesso2 = gruposAvanzadosPO.diferente();

		for (int i = 0; i < sucesso2.size(); i++) {
			assertFalse(sucesso2.get(i), gruposAvanDif);
		}

	}

	@Test(dependsOnMethods = "gruposAvanzados")
	public void eliminarGrupos() {

		boolean sucesso = false;
		sleep(2000);
		sucesso = gruposAvanzadosPO.eliminar();
		System.out.println(sucesso);
		assertTrue(sucesso, gruposAvanDel);

	}

}
