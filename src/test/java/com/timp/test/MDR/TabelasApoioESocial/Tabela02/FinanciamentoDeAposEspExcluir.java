package com.timp.test.MDR.TabelasApoioESocial.Tabela02;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela02.FinanciamentoDeAposEspExcluirPO;

public class FinanciamentoDeAposEspExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FinanciamentoDeAposEspExcluirPO financiamentoDeAposEspExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		financiamentoDeAposEspExcluirPO = new FinanciamentoDeAposEspExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = financiamentoDeAposEspExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
