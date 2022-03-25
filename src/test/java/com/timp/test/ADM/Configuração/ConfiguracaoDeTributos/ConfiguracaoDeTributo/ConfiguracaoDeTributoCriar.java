package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributoCriarPO;

public class ConfiguracaoDeTributoCriar extends TestBaseSteven {	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoCriarPO configuracaoDeTributoCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC(); 
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributoCriarPO = new ConfiguracaoDeTributoCriarPO();
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTributoCriarPO.criar();

		assertTrue(sucesso, Criar);
		sleep(2000);

	}
}
