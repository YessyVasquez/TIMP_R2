package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardCartaoIndicadorEditarPO;

public class DashboardCartaoIndicadorEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardCartaoIndicadorEditarPO dashboardCartaoIndicadorEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardCartaoIndicadorEditarPO = new DashboardCartaoIndicadorEditarPO();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void CartaoIndicador() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardCartaoIndicadorEditarPO.CartaoIndicador();
		assertTrue(sucesso, Editar);
	}
}
