package com.timp.test.BRE.RegrasDeEscrituração.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarMasCaminhoPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoEditarPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscrituraçãoVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoVisualizarPO regrasDeEscrituraçãoVisualizarPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoVisualizarPO = new RegrasDeEscrituraçãoVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	
	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeEscrituraçãoVisualizarPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
		
		
	}
}
