package com.timp.test.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoAjustesContribuiçoesCreditos.CodigoAjustesContribuiçaoCreditosExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoAjustesContribuiçaoCreditosExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoAjustesContribuiçaoCreditosExcluirPO codigoAjustesContribuiçaoCreditosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoAjustesContribuiçaoCreditosExcluirPO = new CodigoAjustesContribuiçaoCreditosExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoAjustesContribuiçaoCreditosExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
