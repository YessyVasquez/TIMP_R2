package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardCartaoIndicadorPO;

public class DashboardCartaoIndicador extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardCartaoIndicadorPO dashboardCartaoIndicadorPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardCartaoIndicadorPO = new DashboardCartaoIndicadorPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		ArrayList<Boolean> sucesso = dashboardCartaoIndicadorPO.CartaoIndicador();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Cartão não foi adicionado");
		}
	}

}
