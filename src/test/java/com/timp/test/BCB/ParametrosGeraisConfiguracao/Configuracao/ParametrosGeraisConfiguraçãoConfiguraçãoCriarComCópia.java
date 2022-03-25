package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoCriarComCópia extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO parametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO = new ParametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO();


	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void criarConfiguracaoHierarquia() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		
		ArrayList<Boolean> sucesso = parametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO.editar();
		System.out.println("veamos: "+sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		
	}
	
	@Test(dependsOnMethods = "criarConfiguracaoHierarquia")
	public void excluirr() {
		
		boolean sucesso = parametrosGeraisConfiguraçãoConfiguraçãoCriarComCópiaPO.excluir();
		assertTrue(sucesso, Editar);

	}

}
