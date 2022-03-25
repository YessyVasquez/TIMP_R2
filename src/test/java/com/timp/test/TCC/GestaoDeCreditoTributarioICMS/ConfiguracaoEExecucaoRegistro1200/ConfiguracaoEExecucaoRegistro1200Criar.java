package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200.ConfiguracaoEExecucaoRegistro1200CriarPO;

public class ConfiguracaoEExecucaoRegistro1200Criar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguracaoEExecucaoRegistro1200CriarPO configuracaoEExecucaoRegistro1200CriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuracaoEExecucaoRegistro1200CriarPO = new ConfiguracaoEExecucaoRegistro1200CriarPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		boolean sucesso = configuracaoEExecucaoRegistro1200CriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);
	}
}
