package com.timp.test.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2CriarCaminhosPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegrasDeAuditoriaN2CriarCaminhos extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeAuditoriaN2CriarCaminhosPO regrasDeAuditoriaN2CriarCaminhosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC(); 
		acessarBREPO = new AcessarBREPO();
		regrasDeAuditoriaN2CriarCaminhosPO = new RegrasDeAuditoriaN2CriarCaminhosPO();
	}

	@AfterClass
	public void afterClass() {
	//  driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		boolean sucesso = regrasDeAuditoriaN2CriarCaminhosPO.criar();

		assertTrue(sucesso, Criar);

	}

}
