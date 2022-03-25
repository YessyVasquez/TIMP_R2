package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoEditarPO;

public class UtilizacaoDosCreditosNaApuracaoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosNaApuracaoEditarPO utilizacaoDosCreditosNaApuracaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosNaApuracaoEditarPO = new UtilizacaoDosCreditosNaApuracaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = utilizacaoDosCreditosNaApuracaoEditarPO.editar();

		assertTrue(sucesso, Editar);

	}
}
