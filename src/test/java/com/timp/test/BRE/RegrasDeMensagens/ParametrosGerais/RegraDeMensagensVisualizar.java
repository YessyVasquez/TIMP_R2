package com.timp.test.BRE.RegrasDeMensagens.ParametrosGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.ParametrosGerais.RegrasDeMensagensVisualizarPO;

public class RegraDeMensagensVisualizar extends TestBaseSteven{
  
	

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeMensagensVisualizarPO regrasDeMensagensVisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeMensagensVisualizarPO = new RegrasDeMensagensVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeMensagensVisualizarPO.visualizar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
		
	}
}