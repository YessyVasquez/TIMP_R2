package com.timp.test.MDR.TabelasApoioESocial.Tabela02;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspDetalhePO;

public class FinanciamentoDeAposEspDetalhe extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	FinanciamentoDeAposEspDetalhePO financiamentoDeAposEspDetalhePO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		financiamentoDeAposEspDetalhePO = new FinanciamentoDeAposEspDetalhePO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhe() {
		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = financiamentoDeAposEspDetalhePO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
