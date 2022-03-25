package com.timp.test.DFG.Leiautes;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal.AssociaçãoCriarPO;
import com.timp.test.DFG.AcessarDFG;


public class ParametrosGeraisCriarRaizIDPúblicoPrivadoCriar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO parametrosGeraisCriarRaizIDPúblicoPrivado;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		parametrosGeraisCriarRaizIDPúblicoPrivado = new ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void criar() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		ArrayList<Boolean> sucesso =parametrosGeraisCriarRaizIDPúblicoPrivado.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
}
