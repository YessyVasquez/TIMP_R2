package com.timp.test.ATR.Estruturas.Estruturas;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarPO;



import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EstruturasVisualizar extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstruturasVisualizarPO estruturasVisualizarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  estruturasVisualizarPO = new  EstruturasVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 	
	 	@Test()
	 	public void visualizar() {
	 		
	 		loginTC.login();
	 		
	 		 acessarATRPO.acessarATR();
	 		 
	 		ArrayList<Boolean> sucesso = estruturasVisualizarPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizaçar);
				
			}	
	 		sleep(3000);
	 }
}
