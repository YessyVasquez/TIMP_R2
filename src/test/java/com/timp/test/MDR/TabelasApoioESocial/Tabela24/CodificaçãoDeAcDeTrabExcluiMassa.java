package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela15.AgenteCausadorDeSGDPExlusionMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabExclusionMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodificaçãoDeAcDeTrabExcluiMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodificaçãoDeAcDeTrabExclusionMassaPO codificaçãoDeAcDeTrabExclusionMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codificaçãoDeAcDeTrabExclusionMassaPO = new CodificaçãoDeAcDeTrabExclusionMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = codificaçãoDeAcDeTrabExclusionMassaPO.criar();

		assertTrue(sucesso, Criar);

	}

	@Test()
	public void excluir() {

		sleep(1000);

		boolean sucesso = codificaçãoDeAcDeTrabExclusionMassaPO.excluir();

		assertTrue(sucesso, Criar);

	}
}
