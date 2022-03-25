package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaVisualizarPO;

public class MapeamentoDeParametrosDeEntradaVisualizar extends TestBaseSteven {

	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaVisualizarPO mapeamentoDeParametrosDeEntradaVisualizarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaVisualizarPO = new  MapeamentoDeParametrosDeEntradaVisualizarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 	@Test()
	 	public void visualizar() {
	 		
	 		 loginTC.login();
			 acessarATRPO.acessarATR();
	 		
	 		ArrayList<Boolean> sucesso = mapeamentoDeParametrosDeEntradaVisualizarPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizaçar);
				
			}
	 		sleep(2000);
	 	}
	
	
}
