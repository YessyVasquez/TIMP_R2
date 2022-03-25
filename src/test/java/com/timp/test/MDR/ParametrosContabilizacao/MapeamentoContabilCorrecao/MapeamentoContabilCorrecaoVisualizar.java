package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoVisualizarPO;

public class MapeamentoContabilCorrecaoVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoContabilCorrecaoVisualizarPO mapeamentoContabilCorrecaoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoContabilCorrecaoVisualizarPO = new MapeamentoContabilCorrecaoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = mapeamentoContabilCorrecaoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
