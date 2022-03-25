package com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AtividadeDeTributacaoXFornecedorEditar extends TestBaseMassiel {
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeDeTributacaoXFornecedorEditarPO atividadeDeTributacaoXFornecedorEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	    driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeDeTributacaoXFornecedorEditarPO = new AtividadeDeTributacaoXFornecedorEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  

	@Test()
	public void editar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = atividadeDeTributacaoXFornecedorEditarPO.Editar();

		assertTrue(sucesso, Editar);
		sleep(2000);
	}

}
