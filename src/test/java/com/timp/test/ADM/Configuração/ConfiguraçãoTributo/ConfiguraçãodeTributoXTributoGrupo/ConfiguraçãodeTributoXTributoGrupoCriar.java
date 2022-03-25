package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãodeTributoXTributoGrupo.ConfiguraçãodeTributoXTributoGrupoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeTributoXTributoGrupoCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãodeTributoXTributoGrupoCriarPO configuraçãodeTributoXTributoGrupoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC(); 
	  acessarADMPO = new AcessarADMPO();
	  configuraçãodeTributoXTributoGrupoCriarPO = new ConfiguraçãodeTributoXTributoGrupoCriarPO();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãodeTributoXTributoGrupoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);

		
	}

}
