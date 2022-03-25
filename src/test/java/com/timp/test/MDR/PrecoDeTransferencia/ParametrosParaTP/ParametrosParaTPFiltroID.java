package com.timp.test.MDR.PrecoDeTransferencia.ParametrosParaTP;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP.ParametrosParaTPFiltroIDPO;

public class ParametrosParaTPFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaTPFiltroIDPO parametrosParaTPFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaTPFiltroIDPO = new ParametrosParaTPFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtroId() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = parametrosParaTPFiltroIDPO.filtroID();
		assertTrue(sucesso, Filtros);

		ArrayList<Boolean> sucesso2 = parametrosParaTPFiltroIDPO.filtroCodCliente();

		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Filtros);
		}

	}
}
