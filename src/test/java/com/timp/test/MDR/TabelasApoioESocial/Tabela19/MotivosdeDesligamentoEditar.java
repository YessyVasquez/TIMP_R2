package com.timp.test.MDR.TabelasApoioESocial.Tabela19;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19.MotivosdeDesligamentoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MotivosdeDesligamentoEditar extends TestBaseKenssy {

	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	MotivosdeDesligamentoEditarPO motivosDesligamentoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		motivosDesligamentoEditarPO = new MotivosdeDesligamentoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editarMotivoDesligamento() {

		loginTC.login();

		accesarMDR.acessarMDR();

		boolean sucesso = motivosDesligamentoEditarPO.editarMotivoDesligamento();
		assertTrue(sucesso, Editar);
	}
}
