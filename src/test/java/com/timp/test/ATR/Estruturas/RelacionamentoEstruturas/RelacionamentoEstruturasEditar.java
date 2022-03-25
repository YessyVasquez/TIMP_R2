package com.timp.test.ATR.Estruturas.RelacionamentoEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasEditarPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RelacionamentoEstruturasEditar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasEditarPO relacionamentoEstruturasEditarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarATRPO = new AcessarATRPO();
	  relacionamentoEstruturasEditarPO = new RelacionamentoEstruturasEditarPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }
  

 	@Test()
 	public void EditarRelacionamento() {
 		
 		loginTC.login();
 		acessarATRPO.acessarATR();
 		
 		ArrayList<Boolean> sucesso =relacionamentoEstruturasEditarPO.editar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
 		sleep(2000);

 	}
}
