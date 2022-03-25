package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DescriçãoDeNatDeLesãoEditar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	DescriçãoDeNatDeLesãoEditarPO descriçãoDeNatDeLesãoEditarPO;

	public DescriçãoDeNatDeLesãoEditar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		descriçãoDeNatDeLesãoEditarPO = new DescriçãoDeNatDeLesãoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = descriçãoDeNatDeLesãoEditarPO.editar();
		assertTrue(sucesso, Editar);
	}
}
