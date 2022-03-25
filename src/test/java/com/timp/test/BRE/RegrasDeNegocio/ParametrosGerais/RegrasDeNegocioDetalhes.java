package com.timp.test.BRE.RegrasDeNegocio.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais.RegrasDeNegocioDetalhesPO;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeNegocioDetalhes extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeNegocioDetalhesPO regrasDeNegocioDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeNegocioDetalhesPO = new RegrasDeNegocioDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void detalhes() {

		loginTC.login();
		acessarBREPO.acessarBRE();
		
		//regrasDeNegocioDetalhesPO.detalhes();
		ArrayList<Boolean> sucesso = regrasDeNegocioDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}
	}


}
