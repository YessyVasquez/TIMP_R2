package com.timp.test.TDK.Dashboard.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao.DashboardCartaoIndicadorExcluirPO;

public class DashboardCartaoIndicadorExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	DashboardCartaoIndicadorExcluirPO dashboardCartaoIndicadorExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		dashboardCartaoIndicadorExcluirPO = new DashboardCartaoIndicadorExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void cartaoindicadroexcluir() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = dashboardCartaoIndicadorExcluirPO.cartaoindicadorexcluir();
		assertTrue(sucesso, "O Cartão  não foi excluido");
	}

}
