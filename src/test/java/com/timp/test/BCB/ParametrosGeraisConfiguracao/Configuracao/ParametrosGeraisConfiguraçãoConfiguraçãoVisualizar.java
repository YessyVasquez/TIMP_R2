package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoEditarPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguraçãoConfiguraçãoVisualizarPO parametrosGeraisConfiguraçãoVisualizarPO;
	
  @BeforeClass
  public void beforeClass() {
	driver = initialization();
	loginTC = new LoginTC();
	acessarBCBPO = new AcessarBCBPO();
	parametrosGeraisConfiguraçãoVisualizarPO = new ParametrosGeraisConfiguraçãoConfiguraçãoVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  
  @Test()
  public void visualizar() {
	  loginTC.login();
		acessarBCBPO.acessar();
		
		ArrayList<Boolean> sucesso = parametrosGeraisConfiguraçãoVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
  }

}
