package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentoEditarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeTributoXTributoGrupoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãodeTributoXTributoGrupoEditarPO configuraçãodeTributoXTributoGrupoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoEditarPO = new ConfiguraçãodeTributoXTributoGrupoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void Editar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãodeTributoXTributoGrupoEditarPO.editar();
		assertTrue(sucesso, Editar);
		sleep(2000);

		
	}
}
