package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeMapeamentoDeTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeMapeamentoDeTributo.ConfiguracaoDeMapeamentoDeTributoCriarPO;

public class ConfiguracaoDeMapeamentoDeTributoCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeMapeamentoDeTributoCriarPO configuracaoDeMapeamentoDeTributoCriarPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeMapeamentoDeTributoCriarPO = new ConfiguracaoDeMapeamentoDeTributoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeMapeamentoDeTributoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
}
