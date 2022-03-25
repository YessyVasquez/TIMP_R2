package com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras.CadastroDeObrasCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroDeObrasCriar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CadastroDeObrasCriarPO cadastroDeObrasCriarPO;
	
  @BeforeClass
	 public void beforeClass() {
	  
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  cadastroDeObrasCriarPO = new CadastroDeObrasCriarPO();
	  
	 }
	
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
	
  
  
  @Test()
  public void criar() {
	  
  
	  loginTC.login();
	  accesarMDRPO.acessarMDR();
	  
	  boolean sucesso = cadastroDeObrasCriarPO.Criar();
	  assertTrue(sucesso, Criar);
	  sleep(2000);
	}

}
