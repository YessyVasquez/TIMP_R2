package com.timp.test.MDR.RateioDeConsorcio;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RateioDeConsorcio.RateioDeConsorcioPesquisaPorIDPO;

public class RateioDeConsorcioPesquisaPorID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RateioDeConsorcioPesquisaPorIDPO rateioDeConsorcioPesquisaPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		rateioDeConsorcioPesquisaPorIDPO = new RateioDeConsorcioPesquisaPorIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = rateioDeConsorcioPesquisaPorIDPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
