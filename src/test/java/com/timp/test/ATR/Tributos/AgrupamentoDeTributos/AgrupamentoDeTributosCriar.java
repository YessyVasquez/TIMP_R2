package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosCriarPO;

public class AgrupamentoDeTributosCriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosCriarPO agrupamentoDeTributosCriarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  agrupamentoDeTributosCriarPO = new  AgrupamentoDeTributosCriarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  

	 	@Test()
	 	public void criar() {
	 		
	 		loginTC.login();
	 		acessarATRPO.acessarATR();
	 		
	 		
	 		boolean sucesso = agrupamentoDeTributosCriarPO.criar();
			assertTrue(sucesso, Criar);
			sleep(2000);
	 		
	 	}
}
