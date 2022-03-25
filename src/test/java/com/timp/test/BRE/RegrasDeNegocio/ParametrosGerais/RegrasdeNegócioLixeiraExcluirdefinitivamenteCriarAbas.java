package com.timp.test.BRE.RegrasDeNegocio.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais.RegrasdeAuditoriaN4LixeiraExcluirdefinitivamentePO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbas extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO = new RegrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

  
	@Test()
	public void lexeira() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();

		boolean sucesso = regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO.lexeira();
		assertTrue(sucesso, Criar);
		sleep(3000);
		boolean sucesso1 = regrasdeNegócioLixeiraExcluirdefinitivamenteCriarAbasPO.excluirDefinitivo();
		assertTrue(sucesso1, Criar);

	}
	


}
