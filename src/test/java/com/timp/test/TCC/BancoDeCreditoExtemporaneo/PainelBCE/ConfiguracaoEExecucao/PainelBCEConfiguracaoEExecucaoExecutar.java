package com.timp.test.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao.PainelBCEConfiguracaoEExecucaoExcecutarPO;

public class PainelBCEConfiguracaoEExecucaoExecutar extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	PainelBCEConfiguracaoEExecucaoExcecutarPO painelBCEConfiguracaoEExecucaoExcecutarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		painelBCEConfiguracaoEExecucaoExcecutarPO = new PainelBCEConfiguracaoEExecucaoExcecutarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void executar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = painelBCEConfiguracaoEExecucaoExcecutarPO.executar();
		assertTrue(sucesso, "Não foi possível executar");
	}
}
