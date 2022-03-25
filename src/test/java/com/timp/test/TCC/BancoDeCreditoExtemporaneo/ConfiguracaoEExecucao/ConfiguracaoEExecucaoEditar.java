package com.timp.test.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoEditarPO;

public class ConfiguracaoEExecucaoEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoEditarPO configuracaoEExecucaoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoEditarPO = new ConfiguracaoEExecucaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
