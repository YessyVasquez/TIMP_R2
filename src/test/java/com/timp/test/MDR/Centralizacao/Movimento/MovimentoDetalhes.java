package com.timp.test.MDR.Centralizacao.Movimento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Movimento.MovimentoDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class MovimentoDetalhes extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MovimentoDetalhesPO movimentoDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		movimentoDetalhesPO = new MovimentoDetalhesPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalheMovimento() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = movimentoDetalhesPO.DetalheMovimento();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizaçar);

		}
		sleep(2000);

	}

}
