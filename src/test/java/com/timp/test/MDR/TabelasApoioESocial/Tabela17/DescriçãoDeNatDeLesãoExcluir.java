package com.timp.test.MDR.TabelasApoioESocial.Tabela17;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17.DescriçãoDeNatDeLesãoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DescriçãoDeNatDeLesãoExcluir extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	DescriçãoDeNatDeLesãoExcluirPO descriçãoDeNatDeLesãoExcluirPO;

	public DescriçãoDeNatDeLesãoExcluir() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		descriçãoDeNatDeLesãoExcluirPO = new DescriçãoDeNatDeLesãoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		boolean sucesso = descriçãoDeNatDeLesãoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
