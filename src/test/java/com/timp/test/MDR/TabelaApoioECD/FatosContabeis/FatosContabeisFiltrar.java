package com.timp.test.MDR.TabelaApoioECD.FatosContabeis;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.FatosContabeis.FatosContabeisFiltrarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatosContabeisFiltrar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	FatosContabeisFiltrarPO fatosContabeisFiltrarPO;

	public FatosContabeisFiltrar() {
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		fatosContabeisFiltrarPO = new FatosContabeisFiltrarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtrarFatosContabeis() {
		loginTC.login();
		boolean sucesso2 = acesarMDRPO.acessarMDR();
		assertTrue(sucesso2, "The element is not present");
		boolean sucesso = fatosContabeisFiltrarPO.filtrarFatosContabeis();
		assertTrue(sucesso, Filtros);
	}
}
