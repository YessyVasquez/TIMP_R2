package com.timp.test.DFG;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarDFG extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarDFGPO  = new AcessarDFGPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 1)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 2)
	public void DFGEntrar() {

		
		boolean sucesso =  acessarDFGPO.acessarDFG();
		assertTrue(sucesso, "The element is not present");

	}

}
