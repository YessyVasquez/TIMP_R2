package com.timp.test.MDR.TabelasApoioESocial.Tabela22;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEntreFPASExcluir extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CompatibilidadeEntreFPASExcluirPO compatibilidadeEntreFPASExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		compatibilidadeEntreFPASExcluirPO = new CompatibilidadeEntreFPASExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluirCompatibilidadeEntreFPAS() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = compatibilidadeEntreFPASExcluirPO.excluirCompatibilidadeEntreFPAS();
		assertTrue(sucesso, Editar);
	}

}
