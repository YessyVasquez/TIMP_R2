package com.timp.test.MDR.Reinf.R1070DadosSuspenso;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosSuspenso.R1070DadosSuspensoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class R1070DadosSuspensoEditar extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosSuspensoEditarPO r1070DadosSuspensoEditarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosSuspensoEditarPO = new R1070DadosSuspensoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
 	public void editar() {

 		loginTC.login();
 		accesarMDR.acessarMDR();

 		boolean sucesso = r1070DadosSuspensoEditarPO.editar();
 		assertTrue(sucesso, Criar);
 		sleep(1000);

 	}

}
