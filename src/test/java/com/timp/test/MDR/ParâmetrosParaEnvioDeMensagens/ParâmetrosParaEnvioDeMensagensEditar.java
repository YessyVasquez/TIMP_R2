package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParâmetrosParaEnvioDeMensagensEditarPO parâmetrosParaEnvioDeMensagensEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensEditarPO = new ParâmetrosParaEnvioDeMensagensEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void editar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = parâmetrosParaEnvioDeMensagensEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
