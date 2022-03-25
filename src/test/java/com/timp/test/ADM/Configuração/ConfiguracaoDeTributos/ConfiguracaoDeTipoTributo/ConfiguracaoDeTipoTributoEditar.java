package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTipoTributo.ConfiguracaoDeTipoTributoEditarPO;

public class ConfiguracaoDeTipoTributoEditar extends TestBaseSteven { 
	LoginTC loginTC; 
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTipoTributoEditarPO configuracaoDeTipoTributoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTipoTributoEditarPO = new ConfiguracaoDeTipoTributoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	

	@Test()
	public void editar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuracaoDeTipoTributoEditarPO.editar();

		assertTrue(sucesso, Editar);	
		sleep(2000);

	}
}
