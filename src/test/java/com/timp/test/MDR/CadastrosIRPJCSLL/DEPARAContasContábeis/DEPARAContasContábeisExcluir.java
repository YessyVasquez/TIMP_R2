package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisExluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DEPARAContasContábeisExcluir extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasContábeisExluirPO dEPARAContasContábeisExluirPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC(); 
	  dEPARAContasContábeisExluirPO = new DEPARAContasContábeisExluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


  
  @Test()
  public void excluir() {
	  
	  loginTC.login();
		accesarMDRPO.acessarMDR();
	  
	 
	  boolean sucesso =  dEPARAContasContábeisExluirPO.Excluir();
	  assertTrue(sucesso, Editar);
	  sleep(2000);
	
	}
}
