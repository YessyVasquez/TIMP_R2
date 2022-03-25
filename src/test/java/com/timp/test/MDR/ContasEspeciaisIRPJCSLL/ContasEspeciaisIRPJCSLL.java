package com.timp.test.MDR.ContasEspeciaisIRPJCSLL;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ContasEspeciaisIRPJCSLL.ContasEspeciaisIRPJCSLLCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContasEspeciaisIRPJCSLL extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ContasEspeciaisIRPJCSLLCriarPO  contasEspeciaisIRPJCSLLPO;
	
	
	
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  contasEspeciaisIRPJCSLLPO = new ContasEspeciaisIRPJCSLLCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
	public void criar() {
	  loginTC.login();
	  accesarMDRPO.acessarMDR();
	  boolean sucesso = contasEspeciaisIRPJCSLLPO.Criar();
	  assertTrue(sucesso, Criar);
	  }
  
 
  
}
