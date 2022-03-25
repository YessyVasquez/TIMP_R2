package com.timp.test.BRE.RegrasdeAuditoriaN1.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.Edicao.RegrasdeAuditoriaN1EdiçãoSimulaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2EdiçãoSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN1EdiçãoSimula extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN1EdiçãoSimulaPO regrasdeAuditoriaN1EdiçãoSimulaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN1EdiçãoSimulaPO = new RegrasdeAuditoriaN1EdiçãoSimulaPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

	@Test()
	public void editar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasdeAuditoriaN1EdiçãoSimulaPO.editar();
		assertTrue(sucesso, Editar);

	}


}
