package com.timp.test.MDR.ParâmetrosParaEnvioDeMensagens;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens.ParâmetrosParaEnvioDeMensagensVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParâmetrosParaEnvioDeMensagensVisualizar extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParâmetrosParaEnvioDeMensagensVisualizarPO parâmetrosParaEnvioDeMensagensVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		parâmetrosParaEnvioDeMensagensVisualizarPO = new ParâmetrosParaEnvioDeMensagensVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 1)
	public void visualizar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = parâmetrosParaEnvioDeMensagensVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
