package com.timp.test.MDR.Centralizacao.FatorCreditamento;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.*;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento.FatorCreditamentoVisualizarPO;

public class FatorCreditamentoVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatorCreditamentoVisualizarPO fatorCreditamentoVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		fatorCreditamentoVisualizarPO = new FatorCreditamentoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = fatorCreditamentoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(2000);
	}
}
