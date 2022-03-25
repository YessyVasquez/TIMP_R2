package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisFiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoFatosContabeisFiltrar extends TestBaseFernando {

	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoFatosContabeisFiltrarPO codigoFatosContabeisFiltrarPO;

	public CodigoFatosContabeisFiltrar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		codigoFatosContabeisFiltrarPO = new CodigoFatosContabeisFiltrarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtrarCodigoFatosContabeis() {
		loginTC.login();
		boolean sucesso2 = acesarMDRPO.acessarMDR();
		assertTrue(sucesso2, "The element is not present");
		boolean sucesso = codigoFatosContabeisFiltrarPO.filtrarCodigoFatosContabeis();
		assertTrue(sucesso, Filtros);
	}
}
