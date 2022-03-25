package com.timp.test.BRE.RegrasDeAuditoriaN3.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.Edicao.RegrasDeAuditoriaN3RelacionamentoPO;

public class RegrasDeAuditoriaN3Relacionamento extends TestBaseSteven{

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3RelacionamentoPO regrasDeAuditoriaN3RelacionamentoPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3RelacionamentoPO = new RegrasDeAuditoriaN3RelacionamentoPO();
  }

  
  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

	@Test()
	public void relacionamento() {
	
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeAuditoriaN3RelacionamentoPO.relacionamento();
		assertTrue(sucesso, "Não foi adicionado o relacionamento");
	
	}

	
	
}
