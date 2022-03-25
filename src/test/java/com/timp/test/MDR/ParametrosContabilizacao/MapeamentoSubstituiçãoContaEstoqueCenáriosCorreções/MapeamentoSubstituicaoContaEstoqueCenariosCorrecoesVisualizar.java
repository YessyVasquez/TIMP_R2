package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoSubstituiçãoContaEstoqueCenáriosCorreções;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaCriarPO;
import com.sap.timp.pageObjectModel.MDR.LimiteCompetencia.LimiteCompetenciaDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO = new MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = mapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}
}
