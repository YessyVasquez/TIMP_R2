package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensCriar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParâmetrosParaEnvioDeMensagensCriarPO parâmetrosParaEnvioDeMensagensCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensCriarPO = new ParâmetrosParaEnvioDeMensagensCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void criar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = parâmetrosParaEnvioDeMensagensCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
