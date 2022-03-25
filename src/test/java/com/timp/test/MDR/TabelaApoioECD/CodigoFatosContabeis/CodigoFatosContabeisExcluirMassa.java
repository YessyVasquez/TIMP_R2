package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeisExcluirMassa extends TestBaseMassiel {
	
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoFatosContabeisExcluirMassaPO  codigoFatosContabeisExcluirMassaPO;
	

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		codigoFatosContabeisExcluirMassaPO  = new CodigoFatosContabeisExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
	public void criar() {
		loginTC.login();
	    acesarMDRPO.acessarMDR();
	
		boolean sucesso2 = codigoFatosContabeisExcluirMassaPO.criar();
		assertTrue(sucesso2, "There is an error...");
		sleep(2000);
	}

  @Test(dependsOnMethods = "criar")
 	public void excluir() {

 		boolean sucesso2 = codigoFatosContabeisExcluirMassaPO.ExcluirMasas();
 		assertTrue(sucesso2, "There is an error...");
 		sleep(2000);
 	}

}
