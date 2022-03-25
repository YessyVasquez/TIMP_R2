package com.timp.test.TBD;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AcessarTBD extends TestBaseSteven{
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarTBDPO = new  AcessarTBDPO();
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
	public void TBDEntrar() {

		
		boolean sucesso =  acessarTBDPO.acessarTBD();
		assertTrue(sucesso, "The element is not present");

	}
}
