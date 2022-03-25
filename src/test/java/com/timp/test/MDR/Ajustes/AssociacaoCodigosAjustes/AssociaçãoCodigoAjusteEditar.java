package com.timp.test.MDR.Ajustes.AssociacaoCodigosAjustes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.AssociacaoCodigosAjustes.AssociaçãoCodigoAjusteEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AssociaçãoCodigoAjusteEditar extends TestBaseFernando{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  AssociaçãoCodigoAjusteEditarPO associaçãoCodigoAjusteEditarPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  associaçãoCodigoAjusteEditarPO = new AssociaçãoCodigoAjusteEditarPO();
	  }
	
	  @AfterClass
	  public void afterClass() {

		  driver.close();

	  }
	  

	  
	  @Test()
	  public void associaçãoCodigoAjusteEditar() {
		  
		  loginTC.login();
		  
		  accesarMDRPO.acessarMDR();
		  
		  boolean sucesso = associaçãoCodigoAjusteEditarPO.editarAssociaçãoCodigoAjuste();
		  assertTrue(sucesso, Editar);
		  sleep(2000);
	  }
}
