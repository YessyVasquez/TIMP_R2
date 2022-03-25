package com.timp.test.BPMA.Processo.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais.ParametrosGeraisVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisVisualizar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	ParametrosGeraisVisualizarPO  parametrosGeraisVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  parametrosGeraisVisualizarPO = new  ParametrosGeraisVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
//	  driver.close();
  }
  
  @Test(priority = 0)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 1)
 	public void BPMAEntrar() {
 		 acessarBPMA.acessarBPMA();
 		
 	}
 	
 	@Test(priority = 1)
 	public void visualizar() {
 		
 		parametrosGeraisVisualizarPO.visualizar();
 		
 		//ArrayList<Boolean> sucesso = parametrosGeraisVisualizarPO.visualizar();
		
		//for (int i = 0; i < sucesso.size(); i++) {
		//	assertTrue(sucesso.get(i), "Visualizacon con Exito");
	//	}
 		
 	}

}
