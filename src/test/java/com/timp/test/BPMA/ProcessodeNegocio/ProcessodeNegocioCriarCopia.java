package com.timp.test.BPMA.ProcessodeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio.ProcessodeNegócioCriarCopiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ProcessodeNegocioCriarCopia extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	 ProcessodeNegócioCriarCopiaPO  processodeNegócioCriarCopiaPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  processodeNegócioCriarCopiaPO = new  ProcessodeNegócioCriarCopiaPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 1)
 	public void BPMAEntrar() {
 		 acessarBPMA.acessarBPMA();
 		
 	}
 	
 	@Test(priority = 1)
 	public void CriarCopia() {
 		processodeNegócioCriarCopiaPO .criar();
 	//	boolean sucesso = processodeNegócioCriarCopiaPO .criar();
		//  assertTrue(sucesso, Criar); 
 		
 	}

}
