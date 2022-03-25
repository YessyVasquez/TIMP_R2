package com.timp.test.MDR.TabelasApoioESocial.Tabela22;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEntreFPASEditar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CompatibilidadeEntreFPASEditarPO compatibilidadeEntreFPASEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		compatibilidadeEntreFPASEditarPO = new CompatibilidadeEntreFPASEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editarCompatibilidadeEntreFPAS() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = compatibilidadeEntreFPASEditarPO.editarCompatibilidadeEntreFPAS();
		assertTrue(sucesso, Editar);
	}

}
