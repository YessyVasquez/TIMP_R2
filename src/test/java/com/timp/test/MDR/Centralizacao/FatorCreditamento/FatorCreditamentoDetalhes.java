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

public class FatorCreditamentoDetalhes extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatorCreditamentoDetalhesPO fatorCreditamentoDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		fatorCreditamentoDetalhesPO = new FatorCreditamentoDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void detalhes() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = fatorCreditamentoDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(2000);
	}
}
