package com.timp.test.ADM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarADM extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test(priority = 1)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 2)
 	public void AcessarADM() {


 		boolean sucesso =  acessarADMPO.acessarADM();
 		assertTrue(sucesso, "The element is not present");

 	}
}
