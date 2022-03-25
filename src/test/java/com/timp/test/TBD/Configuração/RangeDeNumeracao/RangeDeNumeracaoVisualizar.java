package com.timp.test.TBD.Configuração.RangeDeNumeracao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao.RangeDeNumeracaoVisualizarPO;

public class RangeDeNumeracaoVisualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	RangeDeNumeracaoVisualizarPO rangeDeNumeracaoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		rangeDeNumeracaoVisualizarPO = new RangeDeNumeracaoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void visualizar() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		ArrayList<Boolean> sucesso = rangeDeNumeracaoVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(3000);
	}
}
