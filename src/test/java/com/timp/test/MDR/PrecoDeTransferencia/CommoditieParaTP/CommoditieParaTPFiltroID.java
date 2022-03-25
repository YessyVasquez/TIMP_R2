package com.timp.test.MDR.PrecoDeTransferencia.CommoditieParaTP;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.CommoditieParaTP.CommoditieParaTPFiltroIDPO;


public class CommoditieParaTPFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CommoditieParaTPFiltroIDPO commoditieParaTPFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		commoditieParaTPFiltroIDPO = new CommoditieParaTPFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();


		ArrayList<Boolean> sucesso = commoditieParaTPFiltroIDPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Filtros);
		}

	}
}
