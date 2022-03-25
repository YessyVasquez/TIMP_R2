package com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrizaçãoDoLivroOficialVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParametrizaçãoDoLivroOficialVisualizarPO parametrizaçãoDoLivroOficialVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  parametrizaçãoDoLivroOficialVisualizarPO = new ParametrizaçãoDoLivroOficialVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }

	@Test()
	public void visualizar() {
		
		loginTC.login();
		accesarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = parametrizaçãoDoLivroOficialVisualizarPO.visualizar();

			for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
