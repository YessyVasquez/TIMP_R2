package com.timp.test.MDR.TabelasApoioESocial.Tabela21;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela21.NaturezaJuridicaExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NaturezaJuridicaExcluirMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	NaturezaJuridicaExcluirMassaPO naturezaJuridicaExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		naturezaJuridicaExcluirMassaPO = new NaturezaJuridicaExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = naturezaJuridicaExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = naturezaJuridicaExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}

}
