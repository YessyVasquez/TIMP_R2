package com.timp.test.BRE.RegrasDeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.BREGerenciarRegulamentosCriarEditarExcluirPO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.RegrasDeAuditoriaN2CriarCaminhosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class BREGerenciarRegulamentosCriarEditarExcluir extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	BREGerenciarRegulamentosCriarEditarExcluirPO bREGerenciarRegulamentosCriarEditarExcluirPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		bREGerenciarRegulamentosCriarEditarExcluirPO = new BREGerenciarRegulamentosCriarEditarExcluirPO();
  }

  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

	@Test()
	public void criar() {

		loginTC.login();
		acessarBREPO.acessarBRE();

		boolean sucesso = bREGerenciarRegulamentosCriarEditarExcluirPO.criar();
		assertTrue(sucesso, Criar);
	}

}
