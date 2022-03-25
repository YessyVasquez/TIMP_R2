package com.timp.test.TCM.Configuracao.ModeloDeDados;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCM.AcessarTCMPO;
import com.sap.timp.pageObjectModel.TCM.Configuracao.ModeloDeDados.ConfiguracaoModeloDeDadosCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguracaoModeloDeDadosCriar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTCMPO acessarTCMPO;
	ConfiguracaoModeloDeDadosCriarPO configuracaoModeloDeDadosCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCMPO = new AcessarTCMPO();
		configuracaoModeloDeDadosCriarPO = new ConfiguracaoModeloDeDadosCriarPO();
	}

	@AfterClass
	public void afterClass() {
//	driver.close();
	}

	@Test(priority = 1)
	public void criar() {

		loginTC.login();

		acessarTCMPO.acessarTCM();

		boolean sucesso = configuracaoModeloDeDadosCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
