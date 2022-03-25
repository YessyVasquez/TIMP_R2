package com.timp.test.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210.Registro1210VisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Registro1210Visualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1210VisualizarPO registro1210VisualizarPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1210VisualizarPO  = new Registro1210VisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
	public void criar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		ArrayList<Boolean> sucesso = registro1210VisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}

}
