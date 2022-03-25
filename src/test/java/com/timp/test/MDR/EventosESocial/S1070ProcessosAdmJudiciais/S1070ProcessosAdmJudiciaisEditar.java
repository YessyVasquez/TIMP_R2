package com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1070ProcessosAdmJudiciaisEditar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	S1070ProcessosAdmJudiciaisEditarPO s1070ProcessosAdmJudiciaisEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		s1070ProcessosAdmJudiciaisEditarPO = new S1070ProcessosAdmJudiciaisEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = s1070ProcessosAdmJudiciaisEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
