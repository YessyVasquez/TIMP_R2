package com.timp.test.ATR.Estruturas.Estruturas;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas.EstruturasVisualizarFiltrosPO;

public class EstruturasVisualizarFiltros extends TestBaseFernando{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	EstruturasVisualizarFiltrosPO estruturasVisualizarFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarATRPO = new AcessarATRPO();
		estruturasVisualizarFiltrosPO = new  EstruturasVisualizarFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		acessarATRPO.acessarATR();
		
		boolean sucesso = estruturasVisualizarFiltrosPO.visualizar();
		assertTrue(sucesso, visualizaçar);
		
		sleep(3000);
	}
}