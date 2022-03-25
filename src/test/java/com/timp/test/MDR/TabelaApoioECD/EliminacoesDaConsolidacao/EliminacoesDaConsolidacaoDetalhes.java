package com.timp.test.MDR.TabelaApoioECD.EliminacoesDaConsolidacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.EliminacoesDaConsolidacao.EliminacoesDaConsolidacaoDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EliminacoesDaConsolidacaoDetalhes extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	EliminacoesDaConsolidacaoDetalhesPO eliminacoesDaConsolidacaoDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		eliminacoesDaConsolidacaoDetalhesPO = new EliminacoesDaConsolidacaoDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		
	}

	@Test(priority = 0)
	public void ingesar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		acesarMDRPO.acessarMDR();
	}

	@Test(priority = 3)
	public void detalheElimacoeDaConsolidacao() {
		ArrayList<Boolean> sucesso = eliminacoesDaConsolidacaoDetalhesPO.detalheElimacoeDaConsolidacao();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
