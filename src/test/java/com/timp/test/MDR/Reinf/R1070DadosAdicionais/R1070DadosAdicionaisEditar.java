package com.timp.test.MDR.Reinf.R1070DadosAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class R1070DadosAdicionaisEditar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosAdicionaisEditarPO r1070DadosAdicionaisEditarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosAdicionaisEditarPO = new R1070DadosAdicionaisEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
 	public void editar() {

 		loginTC.login();

 		accesarMDR.acessarMDR();
 		
 		

 		boolean sucesso = r1070DadosAdicionaisEditarPO.Editar();
 		assertTrue(sucesso, Criar);
 		sleep(1000);

 	}

}
