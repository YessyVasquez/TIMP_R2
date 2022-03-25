package com.timp.test.MDR.AtividadesParaTributacao.AtividadeDeTributacaoXFornecedor;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor.AtividadeDeTributacaoXFornecedorDetalhesPO;

public class AtividadeDeTributacaoXFornecedorDetalhes extends TestBaseSteven{

	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtividadeDeTributacaoXFornecedorDetalhesPO atividadeDeTributacaoXFornecedorDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		atividadeDeTributacaoXFornecedorDetalhesPO = new AtividadeDeTributacaoXFornecedorDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void Detalhes() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = atividadeDeTributacaoXFornecedorDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}
		sleep(2000);
	}

}
