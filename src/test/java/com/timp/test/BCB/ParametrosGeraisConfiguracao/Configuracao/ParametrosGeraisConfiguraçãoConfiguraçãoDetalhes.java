package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoDetalhes  extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO = new ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		//parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO.parametrosGeraisDetalhes();
		ArrayList<Boolean> sucesso = parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO.parametrosGeraisDetalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

	}

}
