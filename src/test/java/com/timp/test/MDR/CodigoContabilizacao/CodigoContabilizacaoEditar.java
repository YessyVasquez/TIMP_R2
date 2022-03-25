package com.timp.test.MDR.CodigoContabilizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.CodigoContabilizacaoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoContabilizacaoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoContabilizacaoEditarPO codigoContabilizacaoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoContabilizacaoEditarPO = new CodigoContabilizacaoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = codigoContabilizacaoEditarPO.editar();
		
		assertTrue(sucesso, Editar);

	}

}
