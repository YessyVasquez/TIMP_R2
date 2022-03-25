package com.timp.test.ATR.Estruturas.RelacionamentoEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarComCopiaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasExcluirPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RelacionamentoEstruturasExcluir extends TestBaseSteven{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasExcluirPO relacionamentoEstruturasExcluirPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarATRPO = new AcessarATRPO();
	  relacionamentoEstruturasExcluirPO = new RelacionamentoEstruturasExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

 	@Test()
 	public void excluir() {
 		
 		loginTC.login();
 		acessarATRPO.acessarATR();
 		
 		boolean sucesso =relacionamentoEstruturasExcluirPO.excluir();

 		assertTrue(sucesso, Eliminado);
	
 		sleep(2000);

 	}
 	
}
