package com.timp.test.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais.RegrasDeAuditoriaN3CriarMasCaminhoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasDeAuditoriaN3CriarMasCaminho extends TestBaseFernando{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN3CriarMasCaminhoPO regrasDeAuditoriaN3CriarMasCaminhoPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN3CriarMasCaminhoPO = new RegrasDeAuditoriaN3CriarMasCaminhoPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void criarComCaminho() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeAuditoriaN3CriarMasCaminhoPO.criar();
		assertTrue(sucesso, Criar);
	}
}
