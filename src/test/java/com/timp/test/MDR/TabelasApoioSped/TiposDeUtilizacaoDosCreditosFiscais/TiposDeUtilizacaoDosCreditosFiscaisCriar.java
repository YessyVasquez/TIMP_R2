package com.timp.test.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TiposDeUtilizacaoDosCreditosFiscais.TiposDeUtilizacaoDosCreditosFiscaisCriarPO;

public class TiposDeUtilizacaoDosCreditosFiscaisCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeUtilizacaoDosCreditosFiscaisCriarPO tiposDeUtilizacaoDosCreditosFiscaisCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeUtilizacaoDosCreditosFiscaisCriarPO = new TiposDeUtilizacaoDosCreditosFiscaisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tiposDeUtilizacaoDosCreditosFiscaisCriarPO.criar();
		assertTrue(sucesso, semAcesso);
		sleep(2000);

	}

}
