package com.timp.test.ATR.Estruturas.MapeamentoDeEstruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasExcluirPO;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;

public class MapeamentoDeEstruturasExcluir extends TestBaseSteven {
 
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeEstruturasExcluirPO mapeamentoDeEstruturasExcluirPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeEstruturasExcluirPO = new  MapeamentoDeEstruturasExcluirPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	 	@Test()
	 	public void excluir() {
	 		
	 		loginTC.login();
	 		 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeEstruturasExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
}
