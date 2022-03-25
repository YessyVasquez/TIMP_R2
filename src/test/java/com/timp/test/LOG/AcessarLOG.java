package com.timp.test.LOG;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.LOG.AcessarLOGPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarLOG extends TestBaseMassiel{
 
	LoginTC loginTC;
	AcessarLOGPO acessarLOGPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarLOGPO = new AcessarLOGPO();
  }

  @AfterClass
  public void afterClass() {
  }

  @Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void AcessarLOG() {


		boolean sucesso =  acessarLOGPO.acessarLOG();
		assertTrue(sucesso, "The element is not present");

	}
}
