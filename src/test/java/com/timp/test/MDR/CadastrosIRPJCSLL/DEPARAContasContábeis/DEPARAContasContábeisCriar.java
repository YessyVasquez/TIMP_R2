package com.timp.test.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis.DEPARAContasContábeisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DEPARAContasContábeisCriar extends TestBaseMassiel {
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	DEPARAContasContábeisCriarPO dEPARAContasContábeisCriarPO;
 
  @BeforeClass
  public void beforeClass() {
	     driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		dEPARAContasContábeisCriarPO = new DEPARAContasContábeisCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


	@Test()
	public void criar() {
		
		loginTC.login();
		accesarMDRPO.acessarMDR();
		
		//dEPARAContasContábeisCriarPO.Criar();
		  boolean sucesso = dEPARAContasContábeisCriarPO.Criar();
		  assertTrue(sucesso, Criar);
		  sleep(2000);
	  }

}
