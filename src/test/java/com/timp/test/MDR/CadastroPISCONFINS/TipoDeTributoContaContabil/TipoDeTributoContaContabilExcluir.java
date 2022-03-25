package com.timp.test.MDR.CadastroPISCONFINS.TipoDeTributoContaContabil;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TipoDeTributoContaContabil.TipoDeTributoContaContabilExcluirPO;

public class TipoDeTributoContaContabilExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TipoDeTributoContaContabilExcluirPO tipoDeTributoContaContabilExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tipoDeTributoContaContabilExcluirPO = new TipoDeTributoContaContabilExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = tipoDeTributoContaContabilExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
