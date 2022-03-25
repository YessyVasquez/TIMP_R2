package com.timp.test.TCC.FatorDeCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento.FatorDeCreditamentoDetalhesPO;
import com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento.FatorDeCreditamentoFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoDetalhes extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	FatorDeCreditamentoDetalhesPO fatorDeCreditamentoDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		fatorDeCreditamentoDetalhesPO = new FatorDeCreditamentoDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		ArrayList<Boolean> sucesso = fatorDeCreditamentoDetalhesPO.detalhes();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "Ocurrio un error");
		}
	}
}
