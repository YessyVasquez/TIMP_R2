package com.timp.test.MDR.TabelasApoioESocial.Tabela02;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela02.FinanciamientoDeAposEspExcluiMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabExclusionMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela25.TiposDeBenefíciosExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FinanciamientoDeAposEspExcluiMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FinanciamientoDeAposEspExcluiMassaPO financiamientoDeAposEspExcluiMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		financiamientoDeAposEspExcluiMassaPO = new FinanciamientoDeAposEspExcluiMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = financiamientoDeAposEspExcluiMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso1 = financiamientoDeAposEspExcluiMassaPO.exluirMassa();
		assertTrue(sucesso1, Eliminado);
	}
}
