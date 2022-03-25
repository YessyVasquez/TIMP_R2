package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPIC.ValoresParaMetodoPICExcluirEmMasaPO;


import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoPICExcluirEmMasa extends TestBaseKenssy {
  
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ValoresParaMetodoPICExcluirEmMasaPO  valoresParaMetodoPICExcluirEmMasaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  valoresParaMetodoPICExcluirEmMasaPO = new ValoresParaMetodoPICExcluirEmMasaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  @Test()
  public void criar() {
	  
	  loginTC.login();
	  accesarMDR.acessarMDR();
		
	  boolean sucesso = valoresParaMetodoPICExcluirEmMasaPO.criar();
		assertTrue(sucesso, Criar);
		
	  sleep(1000);
  }
  
  @Test(dependsOnMethods = "criar")
  public void excluirEnMasaCompatibilidadeEntreFPAS() {

	  boolean sucesso2 = valoresParaMetodoPICExcluirEmMasaPO.excluirEmMasaValoresParaMetodoPIC();
	  assertTrue(sucesso2, Eliminado);
  }
}
