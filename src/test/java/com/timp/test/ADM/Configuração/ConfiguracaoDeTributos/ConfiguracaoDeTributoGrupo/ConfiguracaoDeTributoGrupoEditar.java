package com.timp.test.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributoGrupo.ConfiguracaoDeTributoGrupoEditarPO;

public class ConfiguracaoDeTributoGrupoEditar extends TestBaseSteven{  
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguracaoDeTributoGrupoEditarPO configuracaoDeTributoGrupoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		configuracaoDeTributoGrupoEditarPO = new ConfiguracaoDeTributoGrupoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configuracaoDeTributoGrupoEditarPO.editar();
		assertTrue(sucesso, Editar);
		
		sleep(2000);

	}
}
