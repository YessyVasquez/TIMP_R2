package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardTabelaExecutarPO;

public class DashboardTabelaExecutar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardTabelaExecutarPO dashboardTabelaExecutarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardTabelaExecutarPO = new DashboardTabelaExecutarPO();
	}
	
	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void TabelaExecutar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardTabelaExecutarPO.TabelaExecutar();
		assertTrue(sucesso, "Tabela não foi executada com sucesso");
	}
}
