package com.timp.test.MDR.TabelaApoioECD.EliminacoesDaConsolidacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.EliminacoesDaConsolidacao.EliminacoesDaConsolidacaVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class EliminacoesDaConsolidacaoVisualizar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	EliminacoesDaConsolidacaVisualizarPO eliminacoesDaConsolidacaoVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		eliminacoesDaConsolidacaoVisualizarPO = new EliminacoesDaConsolidacaVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		acesarMDRPO.acessarMDR();
	}

	@Test(priority = 3)
	public void detalheElimacoeDaConsolidacao() {
		ArrayList<Boolean> sucesso = eliminacoesDaConsolidacaoVisualizarPO.visualizarElimacoeDaConsolidacao();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
