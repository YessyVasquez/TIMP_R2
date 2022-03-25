package com.timp.test.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CadastroNotaFiscalVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO; 
	CadastroNotaFiscalVisualizarPO cadastroNotaFiscalVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroNotaFiscalVisualizarPO = new CadastroNotaFiscalVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
 	public void Visualizar() {
 		loginTC.login();
 		acessarMDRPO.acessarMDR();
 		
 		
 		ArrayList<Boolean> sucesso = cadastroNotaFiscalVisualizarPO.visualizar();

 		for (int i = 0; i < sucesso.size(); i++) {
 			assertTrue(sucesso.get(i), visualizaçar);
 		}
 	}


}
