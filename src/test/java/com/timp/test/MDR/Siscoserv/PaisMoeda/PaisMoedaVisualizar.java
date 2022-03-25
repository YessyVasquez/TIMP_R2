package com.timp.test.MDR.Siscoserv.PaisMoeda;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda.PaisMoedaVisualizarPO;

public class PaisMoedaVisualizar extends TestBaseSteven{
 
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	PaisMoedaVisualizarPO paisMoedaVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		paisMoedaVisualizarPO = new PaisMoedaVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Visualizar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = paisMoedaVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualizaçar);

		}
	}
	
}
