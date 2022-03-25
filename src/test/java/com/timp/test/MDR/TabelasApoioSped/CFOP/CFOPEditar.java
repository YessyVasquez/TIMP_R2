package com.timp.test.MDR.TabelasApoioSped.CFOP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CFOP.CFOPEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CFOPEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CFOPEditarPO cFOPEditarPO;

	public CFOPEditar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		cFOPEditarPO = new CFOPEditarPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		acesarMDRPO.acessarMDR();
	}

	@Test(priority = 3)
	public void editar() {
		boolean sucesso = cFOPEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
