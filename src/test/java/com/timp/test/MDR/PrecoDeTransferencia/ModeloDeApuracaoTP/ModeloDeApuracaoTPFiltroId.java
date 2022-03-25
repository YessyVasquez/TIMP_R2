package com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPFiltroIDPO;

public class ModeloDeApuracaoTPFiltroId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ModeloDeApuracaoTPFiltroIDPO modeloDeApuracaoTPFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		modeloDeApuracaoTPFiltroIDPO = new ModeloDeApuracaoTPFiltroIDPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void filtroId() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = modeloDeApuracaoTPFiltroIDPO.filtro();
		assertTrue(sucesso, Filtros);

	}
}
