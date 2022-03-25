package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentoCriarPO;
import com.sap.timp.pageObjectModel.ADM.Configuração.Licenças.LicençasDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoTributoAgrupamentoCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãoTributoAgrupamentoCriarPO configuraçãoTributoAgrupamentoCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentoCriarPO = new ConfiguraçãoTributoAgrupamentoCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  

	
	@Test()
	public void criar() {

		loginTC.login();
		acessarADMPO.acessarADM();
		boolean sucesso = configuraçãoTributoAgrupamentoCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
		
	}

}
