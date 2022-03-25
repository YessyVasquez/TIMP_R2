package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosVerPO;

public class AgrupamentoDeTributosVer extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosVerPO agrupamentoDeTributosVerPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  agrupamentoDeTributosVerPO = new  AgrupamentoDeTributosVerPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	 	
	 	@Test()
	 	public void visualizar() {
	 		
	 		loginTC.login();
	 		 acessarATRPO.acessarATR();
	 		 
	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosVerPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizaçar);
				
			}
			
	 		sleep(2000);
	 		
	 	}

}
