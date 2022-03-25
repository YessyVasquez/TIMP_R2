package com.timp.test.BRE.RegrasDeEscrituração.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.Edicao.RegrasDeEscrituraçãoEdiçãoRelacionamentoPO;

public class RegrasDeEscrituraçãoEdiçãoRelacionamento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoEdiçãoRelacionamentoPO regrasDeEscrituraçãoEdiçãoRelacionamentoPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoEdiçãoRelacionamentoPO = new RegrasDeEscrituraçãoEdiçãoRelacionamentoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	
	@Test()
	public void relacionamento() {
		
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeEscrituraçãoEdiçãoRelacionamentoPO.relacionamento();
		assertTrue(sucesso, Criar);
	}
}
