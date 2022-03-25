package com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorCriarPO;

public class AtividadeDeTributacaoXFornecedorCriar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeDeTributacaoXFornecedorCriarPO atividadeDeTributacaoXFornecedorCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeDeTributacaoXFornecedorCriarPO = new AtividadeDeTributacaoXFornecedorCriarPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = atividadeDeTributacaoXFornecedorCriarPO.criar();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Criar);
		sleep(2000);
	}


}
