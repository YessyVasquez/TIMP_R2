package com.timp.test.MDR.CadastroPISCONFINS.TipoDeTributoContaContabil;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabiExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TipoDeTributoContaContabiExcluirMassa extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TipoDeTributoContaContabiExcluirMassaPO tipoDeTributoContaContabiExcluirMassaPO;

  @BeforeClass
  public void beforeClass() {
	    driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO(); 
		tipoDeTributoContaContabiExcluirMassaPO = new  TipoDeTributoContaContabiExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }
  
  @Test()
 	public void criar() {
 		
 		loginTC.login();

 		acessarMDRPO.acessarMDR();
 		
 		
 		
 		boolean sucesso = 	tipoDeTributoContaContabiExcluirMassaPO.criar();

 		assertTrue(sucesso, Criar);

 	}
   
   @Test(dependsOnMethods = "criar")
 	public void excluir() {
 	
 		
 		boolean sucesso = 	tipoDeTributoContaContabiExcluirMassaPO.ExcluirMasas();

 		assertTrue(sucesso, Criar);


 	}

}
