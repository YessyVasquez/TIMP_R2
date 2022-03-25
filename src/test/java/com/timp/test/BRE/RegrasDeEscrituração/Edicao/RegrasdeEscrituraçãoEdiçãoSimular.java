package com.timp.test.BRE.RegrasDeEscrituração.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.Edicao.RegrasdeEscrituraçãoEdiçãoSimularPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao.RegrasdeAuditoriaN2EdiçãoSimularPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasdeEscrituraçãoEdiçãoSimular extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasdeEscrituraçãoEdiçãoSimularPO bRERegradeEscrituraçãoEdiçãoSimularPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		bRERegradeEscrituraçãoEdiçãoSimularPO = new RegrasdeEscrituraçãoEdiçãoSimularPO();
  }

  
  @AfterClass
  public void afterClass() {

	  //driver.close();


  }


	@Test()
	public void simular() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();

		boolean sucesso = bRERegradeEscrituraçãoEdiçãoSimularPO.editar();
		assertTrue(sucesso, Editar);

	}

}
