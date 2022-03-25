package com.timp.test.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia.ParametrosGeraisHierarquiaEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaEditarPO parametrosGeraisHierarquiaEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	loginTC = new LoginTC();
	acessarBCBPO = new AcessarBCBPO();
	parametrosGeraisHierarquiaEditarPO = new ParametrosGeraisHierarquiaEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


  
  @Test()
  public void editar() {
	loginTC.login();
	acessarBCBPO.acessar();
		
	boolean sucesso = parametrosGeraisHierarquiaEditarPO.editar();
	assertTrue(sucesso, Editar);
  }

}
