package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensExcluirMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParâmetrosParaEnvioDeMensagensExcluirMassaPO parâmetrosParaEnvioDeMensagensExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensExcluirMassaPO = new ParâmetrosParaEnvioDeMensagensExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = parâmetrosParaEnvioDeMensagensExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(priority = 2)
	public void excluirMassa() {
		boolean sucesso = parâmetrosParaEnvioDeMensagensExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
	}
}
