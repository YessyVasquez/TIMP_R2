package com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIICriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NotasDeclararAnexoIIICriar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	NotasDeclararAnexoIIICriarPO notasDeclararAnexoIIICriarPO;

	public NotasDeclararAnexoIIICriar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		notasDeclararAnexoIIICriarPO = new NotasDeclararAnexoIIICriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acesarMDRPO.acessarMDR();

		boolean sucesso = notasDeclararAnexoIIICriarPO.criarNotasDeclararAnexoIIICriar();
		assertTrue(sucesso, Criar);
	}
}
