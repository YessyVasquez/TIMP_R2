package com.timp.test.BRE.RegrasDeEscrituração.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.Edicao.RegrasDeEscrituraçãoEdiçãoValoresCalculadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscrituraçãoEdiçãoValoresCalculados extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoEdiçãoValoresCalculadosPO regrasDeEscrituraçãoEdiçãoValoresCalculadosPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoEdiçãoValoresCalculadosPO = new RegrasDeEscrituraçãoEdiçãoValoresCalculadosPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
	public void ValoresCalculados() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		
ArrayList<Boolean> sucesso = regrasDeEscrituraçãoEdiçãoValoresCalculadosPO.Valores();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		
	}

}
