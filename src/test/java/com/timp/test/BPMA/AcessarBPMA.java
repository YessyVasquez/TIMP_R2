package com.timp.test.BPMA;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarBPMA extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 1)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 2)
 	public void BPMAEntrar() {

 		
 		boolean sucesso =  acessarBPMA.acessarBPMA();
 		assertTrue(sucesso, "The element is not present");

 	}

}
