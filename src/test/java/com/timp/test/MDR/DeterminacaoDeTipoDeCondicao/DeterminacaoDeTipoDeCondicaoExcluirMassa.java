package com.timp.test.MDR.DeterminacaoDeTipoDeCondicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExlusionMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeterminacaoDeTipoDeCondicaoExcluirMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeTipoDeCondicaoExcluirMassaPO determinacaoDeTipoDeCondicaoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeTipoDeCondicaoExcluirMassaPO = new DeterminacaoDeTipoDeCondicaoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = determinacaoDeTipoDeCondicaoExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);

	}
}
