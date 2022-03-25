package com.timp.test.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais.RegrasDeAuditoriaN4CriarPO;

public class RegrasDeAuditoriaN4Criar extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN4CriarPO regrasDeAuditoriaN4CriarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN4CriarPO = new RegrasDeAuditoriaN4CriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeAuditoriaN4CriarPO.criar();
		assertTrue(sucesso, Criar);
	}
 
}
