package com.timp.test.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2CriarComCopiaPO;

public class RegrasDeAuditoriaN2CriarComCopia extends TestBaseFernando {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN2CriarComCopiaPO regrasDeAuditoriaN2CriarComCopiaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN2CriarComCopiaPO = new RegrasDeAuditoriaN2CriarComCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criarComCopia() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasDeAuditoriaN2CriarComCopiaPO.criarComCopia();
		assertTrue(sucesso, Criar);
	}
}
