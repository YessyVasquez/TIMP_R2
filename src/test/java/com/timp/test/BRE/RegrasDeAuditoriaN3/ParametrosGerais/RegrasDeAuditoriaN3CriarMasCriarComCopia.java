package com.timp.test.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais.RegrasDeAuditoriaN3CriarMasCriarComCopiaPO;

public class RegrasDeAuditoriaN3CriarMasCriarComCopia extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3CriarMasCriarComCopiaPO regrasDeAuditoriaN3CriarMasCriarComCopiaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3CriarMasCriarComCopiaPO = new RegrasDeAuditoriaN3CriarMasCriarComCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criarComCopia() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeAuditoriaN3CriarMasCriarComCopiaPO.criarComCopia();
		assertTrue(sucesso, Criar);
	}
}
