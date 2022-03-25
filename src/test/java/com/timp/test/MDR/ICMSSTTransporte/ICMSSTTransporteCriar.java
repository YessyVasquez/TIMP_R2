package com.timp.test.MDR.ICMSSTTransporte;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ICMSSTTransporte.ICMSSTTransporteCriarPO;
//import com.sap.timp.pageObjectModel.MDR.ICMSSTTransporte.ICMSSTTransporteCriarPO;

public class ICMSSTTransporteCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ICMSSTTransporteCriarPO icmsstTransporteCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		icmsstTransporteCriarPO = new ICMSSTTransporteCriarPO();
	}

	@AfterClass
	public void afterClass() {

		//driver.close();

	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = icmsstTransporteCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
