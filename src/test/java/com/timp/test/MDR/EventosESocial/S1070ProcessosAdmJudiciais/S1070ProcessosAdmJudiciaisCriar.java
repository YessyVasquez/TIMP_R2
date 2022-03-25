package com.timp.test.MDR.EventosESocial.S1070ProcessosAdmJudiciais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1070ProcessosAdmJudiciais.S1070ProcessosAdmJudiciaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1070ProcessosAdmJudiciaisCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	S1070ProcessosAdmJudiciaisCriarPO s1070ProcessosAdmJudiciaisCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		s1070ProcessosAdmJudiciaisCriarPO = new S1070ProcessosAdmJudiciaisCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();
		boolean sucesso = s1070ProcessosAdmJudiciaisCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
