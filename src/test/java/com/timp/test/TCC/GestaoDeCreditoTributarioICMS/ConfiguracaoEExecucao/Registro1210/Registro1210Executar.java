package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210.Registro1210ExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Registro1210Executar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1210ExecutarPO registro1210ExecutarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarTCCPO = new AcessarTCCPO();
	  registro1210ExecutarPO   = new Registro1210ExecutarPO ();
  }

  @AfterClass
  public void afterClass() {
		 driver.close();
  }

  @Test()
 	public void criar() {
 		loginTC.login();
 		acessarTCCPO.acessarTCC();
 		
 		boolean sucesso = registro1210ExecutarPO.executar();
		assertTrue(sucesso, Criar);
 	}
}
