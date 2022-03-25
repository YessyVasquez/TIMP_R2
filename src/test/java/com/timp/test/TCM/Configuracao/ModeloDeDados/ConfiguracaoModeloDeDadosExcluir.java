package com.timp.test.TCM.Configuracao.ModeloDeDados;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCM.AcessarTCMPO;
import com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados.ConfiguracaoModeloDeDadosEditarPO;
import com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados.ConfiguracaoModeloDeDadosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoModeloDeDadosExcluir extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTCMPO acessarTCMPO;
	ConfiguracaoModeloDeDadosExcluirPO configuracaoModeloDeDadosExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCMPO = new AcessarTCMPO();
		configuracaoModeloDeDadosExcluirPO = new ConfiguracaoModeloDeDadosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void excluir() {

		loginTC.login();

		acessarTCMPO.acessarTCM();

		boolean sucesso = configuracaoModeloDeDadosExcluirPO.excluir();
		assertTrue(sucesso, Editar);
	}

}
