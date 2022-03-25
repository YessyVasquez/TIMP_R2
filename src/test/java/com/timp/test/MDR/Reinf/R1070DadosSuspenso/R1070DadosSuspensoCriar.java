package com.timp.test.MDR.Reinf.R1070DadosSuspenso;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosSuspenso.R1070DadosSuspensoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class R1070DadosSuspensoCriar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosSuspensoCriarPO r1070DadosSuspensoCriarPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosSuspensoCriarPO = new R1070DadosSuspensoCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }
  
  @Test()
 	public void criar() {

 		loginTC.login();

 		accesarMDR.acessarMDR();
 		
 		

 		boolean sucesso = r1070DadosSuspensoCriarPO .Criar();
 		assertTrue(sucesso, Criar);
 		sleep(1000);

 	}

}
