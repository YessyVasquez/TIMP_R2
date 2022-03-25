package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeisEditar extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CodigoFatosContabeisEditarPO codigoFatosContabeisEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		codigoFatosContabeisEditarPO = new CodigoFatosContabeisEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editarCodigoFatosContabeis() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = codigoFatosContabeisEditarPO.editarCodigoFatosContabeis();
		assertTrue(sucesso, Editar);
	}
}
