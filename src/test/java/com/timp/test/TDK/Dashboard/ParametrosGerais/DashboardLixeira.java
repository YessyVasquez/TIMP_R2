package com.timp.test.TDK.Dashboard.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.ParametrosGerais.DashboardLixeiraPO;

public class DashboardLixeira extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLixeiraPO dashboardLixeiraPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLixeiraPO = new DashboardLixeiraPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}
	
	@Test()
	public void lixeira() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		boolean sucesso = dashboardLixeiraPO.lixeira();
		assertTrue(sucesso, Eliminado);
	}
}
