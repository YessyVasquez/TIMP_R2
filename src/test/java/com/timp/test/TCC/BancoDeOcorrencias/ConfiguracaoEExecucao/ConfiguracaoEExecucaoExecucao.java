package com.timp.test.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoExecucaoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoEExecucaoExecucao extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoExecucaoPO configuracaoEExecucaoExecucaoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoExecucaoPO = new ConfiguracaoEExecucaoExecucaoPO();
	}

	@AfterClass
	public void afterClass() {

	//	driver.close();

	}


	@Test()
	public void executarr() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoExecucaoPO.executar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

}
