package com.timp.test.TDK.Dashboard.DashboardPublicos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.DashboardPublicos.DashboardLixeiraEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardLixeiraEmMassa extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLixeiraEmMassaPO dashboardLixeiraEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLixeiraEmMassaPO = new DashboardLixeiraEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();

		boolean sucesso = dashboardLixeiraEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirEmMassa() {
		boolean sucesso2 = dashboardLixeiraEmMassaPO.ExcluirMasas();
		assertTrue(sucesso2, Criar);

	}
	
	@Test(dependsOnMethods = "excluirEmMassa")
	public void comparar() {
		boolean sucesso3 = dashboardLixeiraEmMassaPO.comparar();
		assertTrue(sucesso3, Criar);
	}

}
