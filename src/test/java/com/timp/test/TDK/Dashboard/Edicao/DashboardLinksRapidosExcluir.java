package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardLinksRapidosExcluirPO;

public class DashboardLinksRapidosExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardLinksRapidosExcluirPO dashboardLinksRapidosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardLinksRapidosExcluirPO = new DashboardLinksRapidosExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void linkrapidoexcluir() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardLinksRapidosExcluirPO.linksrapidosexcluir();
		assertTrue(sucesso, "O link não foi excluido");
	}

}
