package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialDetalhePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SaldoInicialDetalhe extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialDetalhePO saldoInicialDetalhePO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		saldoInicialDetalhePO = new SaldoInicialDetalhePO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalheSaldoInicial() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = saldoInicialDetalhePO.DetalheSaldoInicial();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizaçar);

		}

	}
}
