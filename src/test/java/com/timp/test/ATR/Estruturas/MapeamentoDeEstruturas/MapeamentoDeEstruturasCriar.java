package com.timp.test.ATR.Estruturas.MapeamentoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasCriarPO;

public class MapeamentoDeEstruturasCriar extends TestBaseSteven {
 
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeEstruturasCriarPO mapeamentoDeEstruturasCriarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeEstruturasCriarPO = new  MapeamentoDeEstruturasCriarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 
	 	@Test()
	 	public void criar() {
	 		
	 		loginTC.login();
	 		 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeEstruturasCriarPO.criar();
			assertTrue(sucesso, Criar);
		
			sleep(2000);
	 	}
	
}
