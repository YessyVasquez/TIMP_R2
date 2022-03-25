package com.timp.test.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada.CodigoContribuicaoSocialApuradaCriarPO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

public class CodigoContribuiçaoSocialApuradaCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContribuicaoSocialApuradaCriarPO codigoContribuicaoSocialApuradaCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContribuicaoSocialApuradaCriarPO = new CodigoContribuicaoSocialApuradaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoContribuicaoSocialApuradaCriarPO.criar();

		assertTrue(sucesso, Criar);

	}

}
