package com.timp.test.BRE.RegrasDeNegocio.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.RegrasDeNegocioCriarComCopiaPO;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RegrasDeNegocioCriarComCopia extends TestBaseSteven{

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeNegocioCriarComCopiaPO regrasDeNegocioCriarComCopiaPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeNegocioCriarComCopiaPO = new RegrasDeNegocioCriarComCopiaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}


	
	@Test()
	public void criar() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		
		ArrayList<Boolean> sucesso = regrasDeNegocioCriarComCopiaPO.criarComCopia();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
}
