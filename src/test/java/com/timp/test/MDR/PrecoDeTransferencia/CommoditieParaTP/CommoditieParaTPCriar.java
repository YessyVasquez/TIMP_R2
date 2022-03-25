package com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CommoditieParaTPCriar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CommoditieParaTPCriarPO commoditieParaTPCriarPO;
	 
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  commoditieParaTPCriarPO = new CommoditieParaTPCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
 
  
  @Test()
	public void criar() {
	  
	  loginTC.login();
	  accesarMDRPO.acessarMDR();
	  boolean sucesso = commoditieParaTPCriarPO.Criar();
	  assertTrue(sucesso, Criar);
	}

  
}
