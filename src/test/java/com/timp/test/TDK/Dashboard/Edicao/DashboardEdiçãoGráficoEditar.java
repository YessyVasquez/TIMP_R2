package com.timp.test.TDK.Dashboard.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardEdiçãoGráficoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardEdiçãoGráficoEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardEdiçãoGráficoEditarPO dashboardEdiçãoGráficoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardEdiçãoGráficoEditarPO = new DashboardEdiçãoGráficoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardEdiçãoGráficoEditarPO.Editar();
		assertTrue(sucesso, Criar);
	}
}
