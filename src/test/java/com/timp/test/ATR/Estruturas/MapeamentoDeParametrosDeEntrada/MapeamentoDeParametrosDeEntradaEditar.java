package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaEditarPO;

public class MapeamentoDeParametrosDeEntradaEditar extends TestBaseSteven {

	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaEditarPO mapeamentoDeParametrosDeEntradaeditarPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaeditarPO = new  MapeamentoDeParametrosDeEntradaEditarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		 driver.close();
	  }
	  

	 	@Test()
	 	public void editar() {
	 		
	 		loginTC.login();
			 acessarATRPO.acessarATR();
			 
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaeditarPO.Editar();
			assertTrue(sucesso, Editar);
			sleep(2000);
	 		
	 	}
	
}
