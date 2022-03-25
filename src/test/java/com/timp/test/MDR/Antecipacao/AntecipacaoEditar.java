package com.timp.test.MDR.Antecipacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AntecipacaoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AntecipacaoEditarPO antecipacaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		antecipacaoEditarPO = new AntecipacaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();

		boolean sucesso = antecipacaoEditarPO.editar();

		assertTrue(sucesso, Editar);
		sleep(2000);
	}
}
