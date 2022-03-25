package com.timp.test.MDR.ParametrosOficializacaoLivros;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros.ParametrosOficializacaoLivrosFiltroPorIDPO;

public class ParametrosOficializacaoLivrosFiltroPorID extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosOficializacaoLivrosFiltroPorIDPO parametrosOficializacaoLivrosFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosOficializacaoLivrosFiltroPorIDPO = new ParametrosOficializacaoLivrosFiltroPorIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = parametrosOficializacaoLivrosFiltroPorIDPO.filtro();
		assertTrue(sucesso, Filtros);

	}

}
