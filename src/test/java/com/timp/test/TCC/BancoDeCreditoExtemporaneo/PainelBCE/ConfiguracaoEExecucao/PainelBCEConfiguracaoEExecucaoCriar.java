package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao.PainelBCEConfiguracaoEExecucaoCriarPO;

public class PainelBCEConfiguracaoEExecucaoCriar extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEConfiguracaoEExecucaoCriarPO painelBCEConfiguracaoEExecucaoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEConfiguracaoEExecucaoCriarPO = new PainelBCEConfiguracaoEExecucaoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = painelBCEConfiguracaoEExecucaoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
