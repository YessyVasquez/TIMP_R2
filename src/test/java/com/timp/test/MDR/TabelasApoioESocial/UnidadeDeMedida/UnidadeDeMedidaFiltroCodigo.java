package com.timp.test.MDR.TabelasApoioESocial.UnidadeDeMedida;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheCriarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida.UnidadeDeMedidaFiltroCodigoPO;

public class UnidadeDeMedidaFiltroCodigo extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	UnidadeDeMedidaFiltroCodigoPO unidadeDeMedidaFiltroCodigoPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		unidadeDeMedidaFiltroCodigoPO = new UnidadeDeMedidaFiltroCodigoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtroCodigo() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = unidadeDeMedidaFiltroCodigoPO.filtro();

		assertTrue(sucesso, Filtros);

	}
}
