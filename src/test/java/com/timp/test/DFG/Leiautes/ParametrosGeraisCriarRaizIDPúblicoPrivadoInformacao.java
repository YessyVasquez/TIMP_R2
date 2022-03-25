package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoInformacao extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO parametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO = new ParametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = parametrosGeraisCriarRaizIDPúblicoPrivadoInformacaoPO.informacao();
		assertTrue(sucesso, Criar);
	}
}
