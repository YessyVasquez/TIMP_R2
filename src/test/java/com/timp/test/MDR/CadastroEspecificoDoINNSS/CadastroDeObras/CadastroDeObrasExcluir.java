package com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras.CadastroDeObrasExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroDeObrasExcluir extends TestBaseMassiel {
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	
	CadastroDeObrasExcluirPO cadastroDeObrasExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  cadastroDeObrasExcluirPO =new  CadastroDeObrasExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

  
  @Test()
  public void excluir() {
	  
	  loginTC.login();
	  accesarMDRPO.acessarMDR();
	  
	  boolean sucesso = cadastroDeObrasExcluirPO.Excluir();
	  assertTrue(sucesso, Editar);
	  sleep(2000);
	}
  

}
