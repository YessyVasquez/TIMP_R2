package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.CodificaçãoDeAcDeTrabEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodificaçãoDeAcDeTrabEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodificaçãoDeAcDeTrabEditarPO codificaçãoDeAcDeTrabEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codificaçãoDeAcDeTrabEditarPO = new CodificaçãoDeAcDeTrabEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = codificaçãoDeAcDeTrabEditarPO.editar();

		assertTrue(sucesso, Editar);

	}

}
