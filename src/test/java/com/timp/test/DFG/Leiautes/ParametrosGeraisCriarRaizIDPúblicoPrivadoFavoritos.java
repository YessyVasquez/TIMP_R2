package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoFavoritos extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO parametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO = new ParametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void favoritos() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = parametrosGeraisCriarRaizIDPúblicoPrivadoFavoritosPO.favoritos();
		assertTrue(sucesso, Criar);
	}
}
