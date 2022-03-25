package com.timp.test.MDR.TabelasApoioESocial.Tabela08;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela08.ClassificacaoTributariaExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ClassificacaoTributariaExcluirMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificacaoTributariaExcluirMassaPO classificacaoTributariaExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificacaoTributariaExcluirMassaPO = new ClassificacaoTributariaExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = classificacaoTributariaExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(priority = 1)
	public void excluirMassa() {
		boolean sucesso = classificacaoTributariaExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Criar);
	}
}
