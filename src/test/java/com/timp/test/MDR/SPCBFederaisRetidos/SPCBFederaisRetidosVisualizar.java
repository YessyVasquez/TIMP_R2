package com.timp.test.MDR.SPCBFederaisRetidos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosVisualizarPO;

public class SPCBFederaisRetidosVisualizar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	SPCBFederaisRetidosVisualizarPO sPCBFederaisRetidosVisualizarPO;

	public SPCBFederaisRetidosVisualizar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		sPCBFederaisRetidosVisualizarPO = new SPCBFederaisRetidosVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {

		loginTC.login();

		acesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = sPCBFederaisRetidosVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
