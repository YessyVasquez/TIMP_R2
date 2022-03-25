package com.timp.test.BRE.CalculoDeTributos.ParametroGerais;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.ParametrosGerais.CalculoDeTributosDetalhesPO;

public class CalculoDeTributosDetalhes extends TestBaseSteven{	
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculoDeTributosDetalhesPO calculoDeTributosDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculoDeTributosDetalhesPO = new CalculoDeTributosDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarBREPO.acessarBRE();
		ArrayList<Boolean> sucesso = calculoDeTributosDetalhesPO.detalhes();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}		
	}
}
