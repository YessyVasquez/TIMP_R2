package com.timp.test.BRE.RegrasDeEscrituração.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarMasCaminhoPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscrituraçãoCriarComCopia extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoCriarComCopiaPO regrasDeEscrituraçãoCriarComCopiaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoCriarComCopiaPO = new RegrasDeEscrituraçãoCriarComCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	@Test()
	public void criarcomCopia() {
		
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		boolean sucesso = regrasDeEscrituraçãoCriarComCopiaPO.criar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(dependsOnMethods = "criarcomCopia")
	public void excluir() {
		
		ArrayList<Boolean> sucesso2 = regrasDeEscrituraçãoCriarComCopiaPO.excluir();
		
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), Eliminado);
		}
	}
	
	
}
