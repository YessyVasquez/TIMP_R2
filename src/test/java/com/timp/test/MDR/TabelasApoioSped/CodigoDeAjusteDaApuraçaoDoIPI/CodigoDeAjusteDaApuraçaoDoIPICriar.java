package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPICriarPO;

public class CodigoDeAjusteDaApuraçaoDoIPICriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApuraçaoDoIPICriarPO codigoDeAjusteDaApuraçaoDoIPICriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApuraçaoDoIPICriarPO = new CodigoDeAjusteDaApuraçaoDoIPICriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeAjusteDaApuraçaoDoIPICriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
