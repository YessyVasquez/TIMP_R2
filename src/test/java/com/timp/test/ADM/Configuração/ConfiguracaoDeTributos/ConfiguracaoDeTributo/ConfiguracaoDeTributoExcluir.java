package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo.ConfiguracaoDeTributoExcluirPO;

public class ConfiguracaoDeTributoExcluir extends TestBaseSteven {	
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoExcluirPO configuracaoDeTributoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributoExcluirPO = new ConfiguracaoDeTributoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTributoExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
		sleep(2000);

	} 
}
