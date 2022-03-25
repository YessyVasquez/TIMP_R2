package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoCriarPO;

public class UtilizacaoDosCreditosNaApuracaoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosNaApuracaoCriarPO utilizacaoDosCreditosNaApuracaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosNaApuracaoCriarPO = new UtilizacaoDosCreditosNaApuracaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		
		boolean sucesso = utilizacaoDosCreditosNaApuracaoCriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
