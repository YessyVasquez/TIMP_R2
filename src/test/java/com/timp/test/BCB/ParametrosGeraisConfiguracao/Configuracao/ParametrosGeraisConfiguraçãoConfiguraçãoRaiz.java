package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoFavoritosPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoRaiz extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO parametrosGeraisConfiguraçãoConfiguraçãoRaizPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoRaizPO = new ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		boolean sucesso = parametrosGeraisConfiguraçãoConfiguraçãoRaizPO.raizConfiguracao();
		assertTrue(sucesso, "O registro existe na raiz");
	
	}

}
