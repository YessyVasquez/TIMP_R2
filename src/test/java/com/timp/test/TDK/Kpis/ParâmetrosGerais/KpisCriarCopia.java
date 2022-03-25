package com.timp.test.TDK.Kpis.ParâmetrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.KpisCriarCopiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class KpisCriarCopia extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisCriarCopiaPO kpisCriarCopiaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisCriarCopiaPO = new KpisCriarCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criarCopia() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		ArrayList<Boolean> sucesso = kpisCriarCopiaPO.Criar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
	
	@Test(dependsOnMethods = "criarCopia")
	public void comparar() {
		boolean sucesso1 = kpisCriarCopiaPO.Excluir();
		assertTrue(sucesso1, Criar);

		ArrayList<Boolean> sucesso2 = kpisCriarCopiaPO.comparar();

		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Detalhes);
		}
	}
}
