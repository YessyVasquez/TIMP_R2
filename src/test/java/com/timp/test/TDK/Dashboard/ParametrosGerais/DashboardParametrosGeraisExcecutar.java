package com.timp.test.TDK.Dashboard.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.ParametrosGerais.DashboardParametrosGeraisExcecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DashboardParametrosGeraisExcecutar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardParametrosGeraisExcecutarPO dashboardParametrosGeraisExcecutarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardParametrosGeraisExcecutarPO = new DashboardParametrosGeraisExcecutarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Executar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = dashboardParametrosGeraisExcecutarPO.Executar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Cartão não foi adicionado");
		}
	}
}
