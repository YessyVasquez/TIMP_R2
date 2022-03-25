package com.timp.test.MDR.Centralizacao.Tributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos.TributosVisualizarPO;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TributosVisualizar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TributosVisualizarPO tributosVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tributosVisualizarPO = new TributosVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}



	@Test(priority = 2)
	public void visualizar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		
		ArrayList<Boolean> sucesso = tributosVisualizarPO.visualizarTributo();
		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizaçar);

		}
		sleep(2000);
	}
}
