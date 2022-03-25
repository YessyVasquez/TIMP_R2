package com.timp.test.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheCriarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.DefinicaoVinculacao.DefinicaoVinculacaoFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModelosApuracaoTPFiltroIDPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPFiltroIDPO;

public class ParametroModeloApuracaoTPFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP.ParametrosModelosApuracaoTPFiltroIDPO parametrosModelosApuracaoTPFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosModelosApuracaoTPFiltroIDPO = new ParametrosModelosApuracaoTPFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtro() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = parametrosModelosApuracaoTPFiltroIDPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

	}
}
