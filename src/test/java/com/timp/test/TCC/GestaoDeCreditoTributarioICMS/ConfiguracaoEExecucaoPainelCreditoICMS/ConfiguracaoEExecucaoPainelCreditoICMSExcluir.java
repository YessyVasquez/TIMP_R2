package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS.ConfiguracaoEExecucaoPainelCreditoICMSExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoPainelCreditoICMSExcluir extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoPainelCreditoICMSExcluirPO configuracaoEExecucaoPainelCreditoICMSExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoPainelCreditoICMSExcluirPO = new ConfiguracaoEExecucaoPainelCreditoICMSExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void excluir() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoPainelCreditoICMSExcluirPO.Excluir();
		assertTrue(sucesso, Eliminado);
	}

}
