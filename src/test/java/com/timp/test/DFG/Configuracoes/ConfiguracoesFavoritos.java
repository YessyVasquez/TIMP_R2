package com.timp.test.DFG.Configuracoes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesFavoritosPO;

public class ConfiguracoesFavoritos extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesFavoritosPO configuracoesFavoritosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesFavoritosPO = new ConfiguracoesFavoritosPO();
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}


	@Test()
	public void favoritos() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = configuracoesFavoritosPO.favoritos();
		assertTrue(sucesso, Criar);
	}
}
