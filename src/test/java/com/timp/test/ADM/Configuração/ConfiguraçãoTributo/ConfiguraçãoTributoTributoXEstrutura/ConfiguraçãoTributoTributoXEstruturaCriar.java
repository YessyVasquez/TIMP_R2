package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoTributoXEstrutura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoTributoXEstrutura.ConfiguraçãoTributoTributoXEstruturaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoTributoTributoXEstruturaCriar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãoTributoTributoXEstruturaCriarPO configuraçãoTributoTributoXEstruturaCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoTributoXEstruturaCriarPO = new ConfiguraçãoTributoTributoXEstruturaCriarPO();
  }

  @AfterClass
  public void afterClass() {

	  driver.close();
	  

  }

	@Test()
	public void criar() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configuraçãoTributoTributoXEstruturaCriarPO.criar();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		
		boolean sucesso = configuraçãoTributoTributoXEstruturaCriarPO.excluir();
		assertTrue(sucesso, Criar);
		
		sleep(2000);
	}


}
