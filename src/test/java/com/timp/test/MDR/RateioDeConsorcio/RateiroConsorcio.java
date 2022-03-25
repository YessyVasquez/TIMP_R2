package com.timp.test.MDR.RateioDeConsorcio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RateiroConsorcio.RateiroConsorcioPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RateiroConsorcio extends TestBaseMassiel {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RateiroConsorcioPO rateiroConsorcioPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		rateiroConsorcioPO = new RateiroConsorcioPO();
	}

	@AfterClass
	public void afterClass() {
		// cerrar navegador
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		rateiroConsorcioPO.Criar();
	}

}
