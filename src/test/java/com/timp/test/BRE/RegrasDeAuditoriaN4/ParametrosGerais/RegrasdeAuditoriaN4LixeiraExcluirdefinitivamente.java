package com.timp.test.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais.RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasdeAuditoriaN2LixeiraExcluirdefinitivamentePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeAuditoriaN4LixeiraExcluirdefinitivamente extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO = new RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

	@Test()
	public void lixeira() {
		loginTC.login();
		acessarBREPO.acessarBRE();

		boolean sucesso = regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO.lexeira();
		assertTrue(sucesso, "Lixeira");
		sleep(3000);
		
	}
	
	@Test(dependsOnMethods = "lixeira")	
	public void excluirDefinitivo() {
		boolean sucesso1 = regrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO.excluirDefinitivo();
		assertTrue(sucesso1, Eliminado);
	}
}
