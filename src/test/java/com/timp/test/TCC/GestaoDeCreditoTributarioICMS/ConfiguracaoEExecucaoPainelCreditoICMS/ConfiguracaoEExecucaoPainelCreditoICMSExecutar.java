package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS.ConfiguracaoEExecucaoPainelCreditoICMSExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoPainelCreditoICMSExecutar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoPainelCreditoICMSExecutarPO configuracaoEExecucaoPainelCreditoICMSExecutarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoPainelCreditoICMSExecutarPO = new ConfiguracaoEExecucaoPainelCreditoICMSExecutarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Executar() {
		
		loginTC.login();
		acessarTCCPO.acessarTCC();

		boolean sucesso = configuracaoEExecucaoPainelCreditoICMSExecutarPO.Executar();
		assertTrue(sucesso, Criar);
	}
}
