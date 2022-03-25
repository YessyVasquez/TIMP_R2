package com.timp.test.BRE.CalculoDeTributos.ParametroGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.ParametrosGerais.CalculoDeTributosVisualizarPO;

public class CalculoDeTributosVisualizar extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculoDeTributosVisualizarPO calculoDeTributosVisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculoDeTributosVisualizarPO = new CalculoDeTributosVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test(priority = 2)
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = calculoDeTributosVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}	
	}
}
