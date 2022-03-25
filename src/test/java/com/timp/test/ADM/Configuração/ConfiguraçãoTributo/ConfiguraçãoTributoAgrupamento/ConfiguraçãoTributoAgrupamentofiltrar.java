package com.timp.test.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento.ConfiguraçãoTributoAgrupamentofiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguraçãoTributoAgrupamentofiltrar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ConfiguraçãoTributoAgrupamentofiltrarPO configuraçãoTributoAgrupamentofiltrarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configuraçãoTributoAgrupamentofiltrarPO = new ConfiguraçãoTributoAgrupamentofiltrarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  

	@Test()
	public void filtros() {

		loginTC.login();
		acessarADMPO.acessarADM();
		configuraçãoTributoAgrupamentofiltrarPO.filtro();
		sleep(2000);
		
	}

}
