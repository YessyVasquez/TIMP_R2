package com.timp.test.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao.UtilizacaoDosCreditosNaApuracaoExcluirPO;

public class UtilizacaoDosCreditosNaApuracaoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UtilizacaoDosCreditosNaApuracaoExcluirPO utilizacaoDosCreditosNaApuracaoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		utilizacaoDosCreditosNaApuracaoExcluirPO = new UtilizacaoDosCreditosNaApuracaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = utilizacaoDosCreditosNaApuracaoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
