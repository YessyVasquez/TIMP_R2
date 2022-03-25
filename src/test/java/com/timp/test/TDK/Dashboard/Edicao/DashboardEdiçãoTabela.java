package com.timp.test.TDK.Dashboard.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardEdiçãoTabelaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DashboardEdiçãoTabela extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardEdiçãoTabelaPO dashboardEdiçãoTabelaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardEdiçãoTabelaPO = new DashboardEdiçãoTabelaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		dashboardEdiçãoTabelaPO.Editar();
		// boolean sucesso = dashboardEdiçãoGráficoPO.Editar();
		// assertTrue(sucesso,Criar);
	}
}
