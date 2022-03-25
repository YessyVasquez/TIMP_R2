package com.timp.test.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia.ParametrosGeraisHierarquiaCriarComCópiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisHierarquiaCriarComCópia extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisHierarquiaCriarComCópiaPO parametrosGeraisHierarquiaCriarComCópiaPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisHierarquiaCriarComCópiaPO = new ParametrosGeraisHierarquiaCriarComCópiaPO();


	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criarConfiguracaoHierarquia() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		ArrayList<Boolean> sucesso = parametrosGeraisHierarquiaCriarComCópiaPO.criar();
		System.out.println("veamos"+sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
			
		}
		
		boolean sucesso1 = parametrosGeraisHierarquiaCriarComCópiaPO.excluir();

		assertTrue(sucesso1, Eliminado);
		
		boolean sucesso2 = parametrosGeraisHierarquiaCriarComCópiaPO.excluirLixeira();

		assertTrue(sucesso2, Eliminado);
	}
	

	


}
