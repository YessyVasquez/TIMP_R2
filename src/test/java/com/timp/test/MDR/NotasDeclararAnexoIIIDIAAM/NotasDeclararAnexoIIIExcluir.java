package com.timp.test.MDR.NotasDeclararAnexoIIIDIAAM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.NotasDeclararAnexoIIIDIAAM.NotasDeclararAnexoIIIExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NotasDeclararAnexoIIIExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	NotasDeclararAnexoIIIExcluirPO notasDeclararAnexoIIIExcluirPO;

	public NotasDeclararAnexoIIIExcluir() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		notasDeclararAnexoIIIExcluirPO = new NotasDeclararAnexoIIIExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {

		loginTC.login();

		acesarMDRPO.acessarMDR();

		boolean sucesso = notasDeclararAnexoIIIExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
