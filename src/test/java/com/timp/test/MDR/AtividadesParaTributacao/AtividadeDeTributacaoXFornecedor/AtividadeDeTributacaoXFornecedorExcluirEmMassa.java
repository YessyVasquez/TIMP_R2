package com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorExcluirEmMassaPO;

public class AtividadeDeTributacaoXFornecedorExcluirEmMassa extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeDeTributacaoXFornecedorExcluirEmMassaPO atividadeDeTributacaoXFornecedorExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeDeTributacaoXFornecedorExcluirEmMassaPO = new AtividadeDeTributacaoXFornecedorExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = atividadeDeTributacaoXFornecedorExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso2 = atividadeDeTributacaoXFornecedorExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);
		sleep(2000);
	}

}

