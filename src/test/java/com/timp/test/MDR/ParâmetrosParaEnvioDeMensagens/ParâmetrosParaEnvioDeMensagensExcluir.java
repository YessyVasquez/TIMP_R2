package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParâmetrosParaEnvioDeMensagensExcluirPO parâmetrosParaEnvioDeMensagensExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensExcluirPO = new ParâmetrosParaEnvioDeMensagensExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void excluir() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = parâmetrosParaEnvioDeMensagensExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
