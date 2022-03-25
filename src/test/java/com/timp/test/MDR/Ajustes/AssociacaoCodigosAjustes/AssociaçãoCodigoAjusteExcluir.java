package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AssociaçãoCodigoAjusteExcluir extends TestBaseFernando{
  LoginTC loginTC;
  AcessarMDRPO accesarMDRPO;
  AssociaçãoCodigoAjusteExcluirPO associaçãoCodigoAjusteExcluirPO;
  
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
	  loginTC = new LoginTC();
	  accesarMDRPO = new AcessarMDRPO();
	  associaçãoCodigoAjusteExcluirPO = new AssociaçãoCodigoAjusteExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  
  @Test(priority = 2)
  public void excluirAssociaçãoCodigoAjuste() {
	  
	  loginTC.login();
	  
	  accesarMDRPO.acessarMDR();
	  
	  boolean sucesso = associaçãoCodigoAjusteExcluirPO.excluirAssociaçãoCodigoAjuste();
	  assertTrue(sucesso, Eliminado);
	  
	  sleep(2000);
  }
}
