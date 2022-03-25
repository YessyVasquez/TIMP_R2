package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosCriarComCopiaPO;

public class AgrupamentoDeTributosCriarComCopia extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosCriarComCopiaPO agrupamentoDeTributosCriarComCopiaPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  agrupamentoDeTributosCriarComCopiaPO = new  AgrupamentoDeTributosCriarComCopiaPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	 	@Test()
	 	public void criarcopia() {
	 		
	 		loginTC.login();
	 		acessarATRPO.acessarATR();
	 		
	 		
	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosCriarComCopiaPO.criarcopia();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Criar);
				
			}
			
	 		sleep(2000);
	 		
	 	}
    
  
}
