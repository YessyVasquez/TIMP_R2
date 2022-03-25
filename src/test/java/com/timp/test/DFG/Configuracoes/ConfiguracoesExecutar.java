package com.timp.test.DFG.Configuracoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesExecutar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesExecutarPO configuracoesExecutarPO;
  
  @BeforeClass
  public void beforeClass() {
	    driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesExecutarPO = new ConfiguracoesExecutarPO();
  }

  @AfterClass
  public void afterClass() {

	  driver.close();

  }

 

	@Test()
	public void executar() {
		
		loginTC.login();
		acessarDFGPO.acessarDFG();
		ArrayList<Boolean> sucesso =configuracoesExecutarPO.Executar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
}
