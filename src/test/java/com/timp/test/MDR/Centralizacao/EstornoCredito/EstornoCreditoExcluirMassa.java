package com.timp.test.MDR.Centralizacao.EstornoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito.EstornoCreditoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class EstornoCreditoExcluirMassa extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EstornoCreditoExcluirMassaPO estornoCreditoExcluirMassaPO;
	

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO(); 
		estornoCreditoExcluirMassaPO = new EstornoCreditoExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = 	estornoCreditoExcluirMassaPO.CriarEstornoCredito();

		assertTrue(sucesso, Criar);
		sleep(2000);

	}
  
  @Test(dependsOnMethods = "criar")
	public void excluir() {
	
		
		boolean sucesso = 	estornoCreditoExcluirMassaPO.ExcluirMasas();

		assertTrue(sucesso, Criar);
		sleep(2000);


	}
}
