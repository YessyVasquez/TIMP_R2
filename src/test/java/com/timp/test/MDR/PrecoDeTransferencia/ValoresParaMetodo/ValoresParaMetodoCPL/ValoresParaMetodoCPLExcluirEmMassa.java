package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCPL.ValoresParaMetodoCPLExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoCPLExcluirEmMassa extends TestBaseKenssy {
  
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	 ValoresParaMetodoCPLExcluirEmMassaPO valoresParaMetodoCPLExcluirEmMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  valoresParaMetodoCPLExcluirEmMassaPO = new ValoresParaMetodoCPLExcluirEmMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test(priority = 1)
  public void criar() {
	loginTC.login();
	acessarMDRPO.acessarMDR();
		
	boolean sucesso = valoresParaMetodoCPLExcluirEmMassaPO.criar();
	assertTrue(sucesso, Criar);
  }
  
  @Test(dependsOnMethods = "criar")
  public void excluirEmMassa() {

	boolean sucesso2 = valoresParaMetodoCPLExcluirEmMassaPO.valoresParaMetodoCPLExcluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

}
