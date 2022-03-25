package com.timp.test.MDR.CadastroDerex.InstituicaoFinanceira;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheCriarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheFiltroIdPO;

public class InstituicaoFiltroId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InstituicaoFiltroIdPO instituicaoFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		instituicaoFiltroIdPO = new InstituicaoFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 2)
	public void filtroId() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = instituicaoFiltroIdPO.filtro();

		assertTrue(sucesso, Filtros);
		sleep(2000);
	}
}
