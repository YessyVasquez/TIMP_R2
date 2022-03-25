package com.timp.test.MDR.CadastroEspecificoDoINNSS.CadastroDeObras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras.CadastroDeObrasExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CadastroDeObrasExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CadastroDeObrasExcluirEmMassaPO cadastroDeObrasExcluirEmMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  cadastroDeObrasExcluirEmMassaPO = new CadastroDeObrasExcluirEmMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

  
  @Test()
  public void criar() {
	  
	  loginTC.login();
	  accesarMDR.acessarMDR();
	  
	boolean sucesso = cadastroDeObrasExcluirEmMassaPO.criar();
	assertTrue(sucesso, Criar);
	sleep(1000);

  }
  
  @Test(dependsOnMethods = "criar")
  public void excluirEmMassa() {
	  
	boolean sucesso2 = cadastroDeObrasExcluirEmMassaPO.cadastroDeObrasExcluirEmMassa();
	assertTrue(sucesso2, Eliminado);
	sleep(2000);
  }

}
