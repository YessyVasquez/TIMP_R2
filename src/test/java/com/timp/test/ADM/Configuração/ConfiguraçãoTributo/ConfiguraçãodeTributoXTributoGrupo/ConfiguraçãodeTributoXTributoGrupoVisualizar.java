package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentoVisualizarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeTributoXTributoGrupoVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãodeTributoXTributoGrupoVisualizarPO configuraçãodeTributoXTributoGrupoVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoVisualizarPO = new ConfiguraçãodeTributoXTributoGrupoVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void visualizar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		ArrayList<Boolean> sucesso = configuraçãodeTributoXTributoGrupoVisualizarPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		
		sleep(2000);
	} 

}
