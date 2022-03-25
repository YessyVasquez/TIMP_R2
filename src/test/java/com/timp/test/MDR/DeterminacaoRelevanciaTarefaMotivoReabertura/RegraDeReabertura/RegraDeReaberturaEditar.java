package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura.RegradeReaberturaEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegraDeReaberturaEditar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RegradeReaberturaEditarPO regradeReaberturaEditarPO;
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  regradeReaberturaEditarPO =new RegradeReaberturaEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  
  
  
  @Test()
  public void editar() {
	  

		loginTC.login();
		accesarMDRPO.acessarMDR();
	
	  boolean sucesso = regradeReaberturaEditarPO.Editar();
	  assertTrue(sucesso, Editar);
	  
	}

}
