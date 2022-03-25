package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaExcluirPO;

public class MapeamentoDeParametrosDeEntradaExcluir extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaExcluirPO mapeamentoDeParametrosDeEntradaExcluirPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaExcluirPO = new  MapeamentoDeParametrosDeEntradaExcluirPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  
	 	
	 	@Test()
	 	public void Excluir() {
	 		
	 		loginTC.login();
			 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
	
 
}
