package com.timp.test.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoExcluirPO;

public class ConfiguracaoEExecucaoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoExcluirPO configuracaoEExecucaoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoExcluirPO = new ConfiguracaoEExecucaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluirExecutar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}

}
