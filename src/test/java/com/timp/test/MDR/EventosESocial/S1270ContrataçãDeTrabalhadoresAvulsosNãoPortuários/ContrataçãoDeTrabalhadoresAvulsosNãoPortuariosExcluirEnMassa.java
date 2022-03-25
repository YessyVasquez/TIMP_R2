package com.timp.test.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1270ContrataçãDeTrabalhadoresAvulsosNãoPortuários.ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO  contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO = new ContrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

  
  @Test()
  public void criar() {
	  
	loginTC.login();
	accesarMDR.acessarMDR();
	boolean sucesso = contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO.criar();
	assertTrue(sucesso, Criar);
	sleep(1000);
	
	boolean sucesso2 = contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO.excluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }
  
  @Test(dependsOnMethods = "criar")
  public void excluirEmMassa() {
	
	boolean sucesso2 = contrataçãoDeTrabalhadoresAvulsosNãoPortuariosExcluirEnMassaPO.excluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

}
