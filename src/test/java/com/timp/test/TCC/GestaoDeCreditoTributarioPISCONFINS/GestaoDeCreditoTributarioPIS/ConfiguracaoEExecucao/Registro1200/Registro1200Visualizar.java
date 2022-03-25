package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1200;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1200.Registro1200VisualizarPO;

public class Registro1200Visualizar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registro1200VisualizarPO registro1200VisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registro1200VisualizarPO = new Registro1200VisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void visualizar() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		
		ArrayList<Boolean> sucesso = registro1200VisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}

}
