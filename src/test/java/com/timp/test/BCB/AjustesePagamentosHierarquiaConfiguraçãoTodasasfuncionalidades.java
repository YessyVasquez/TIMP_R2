package com.timp.test.BCB;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.AjustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao.DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class AjustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidades extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	AjustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO = new AjustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}
	
	@Test(priority = 0)
	public void login() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void taaEntrar() {
		boolean sucesso = ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO.accesarTaa();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}
	
	@Test(priority = 2)
	public void tpcEntrar() {
		boolean sucesso = ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO.accesarTpc();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}
	@Test(priority = 3)
	public void bcbEntrar() {
		boolean sucesso = ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO.accesarBCB();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);
	}
	@Test(priority = 4)
	public void criarHerarquia() {
		ArrayList<Boolean> sucesso = ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO.criarHerarquia();
		//System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	@Test(priority = 5)
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO.criarConfiguracao();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	  @Test(priority = 6)
	  public void editarConfiguracion() {

		boolean sucesso = ajustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO.editarConfiguracao();

		assertTrue(sucesso, Editar);

	  }

}
