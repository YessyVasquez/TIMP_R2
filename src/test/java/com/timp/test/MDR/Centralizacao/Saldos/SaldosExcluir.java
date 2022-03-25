package com.timp.test.MDR.Centralizacao.Saldos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos.SaldosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SaldosExcluir extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldosExcluirPO saldosExcluirPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldosExcluirPO = new SaldosExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }
  @Test()
 	public void excluir() {

 		loginTC.login();

 		acessarMDRPO.acessarMDR();
 		
 		
 		boolean sucesso = saldosExcluirPO.Excluir();
 		assertTrue(sucesso, semAcesso);

 	}
}
