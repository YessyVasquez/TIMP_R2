package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI.ValoresParaMetodoPCIExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoPCIExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	 ValoresParaMetodoPCIExcluirEmMassaPO valoresParaMetodoPCIExcluirEmMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  valoresParaMetodoPCIExcluirEmMassaPO = new ValoresParaMetodoPCIExcluirEmMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
  public void criar() {
	loginTC.login();
	acessarMDRPO.acessarMDR();
		
	boolean sucesso = valoresParaMetodoPCIExcluirEmMassaPO.criar();
	assertTrue(sucesso, Criar);
  }
  
  @Test(dependsOnMethods = "criar")
  public void excluirEmMassa() {
	  
	boolean sucesso2 = valoresParaMetodoPCIExcluirEmMassaPO.valoresParaMetodoPCIExcluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

}
