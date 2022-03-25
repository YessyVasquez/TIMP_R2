package com.timp.test.BCB;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.HierarquiaConfiguracaoTodasAsFuncionalidadesPO;



public class HierarquiaConfiguracaoTodasAsFuncionalidades extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	HierarquiaConfiguracaoTodasAsFuncionalidadesPO hierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		hierarquiaConfiguracaoTodasAsFuncionalidadesPO = new HierarquiaConfiguracaoTodasAsFuncionalidadesPO();


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
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}

	@Test(priority = 2)
	public void criarConfiguracaoHierarquia() {
		
		ArrayList<Boolean> sucesso = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierariquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
		
	}
	
	@Test(priority = 3)
	public void criarConfiguracao() {
		sleep(2000);
		boolean sucesso = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracao();
		assertTrue(sucesso, Criar);
	}

	@Test(priority = 4)
	public void configurarConfiguracao() {
		hierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracao();	
	}
	
	
	@Test(priority = 5)
	public void executar() {
		hierarquiaConfiguracaoTodasAsFuncionalidadesPO.executar();
	}
	
	@Test(priority = 6)
	public void subNiveles() {
		
		
		ArrayList<Boolean> subNivel1 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subnivel1();
		
		for (int i = 0; i < subNivel1.size(); i++) {
			assertTrue(subNivel1.get(i), "Erro no Subnivel 1");
		}
		
		ArrayList<Boolean> subNivel2 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel2();
		
		for (int i = 0; i < subNivel2.size(); i++) {
			assertTrue(subNivel2.get(i), "Erro no Subnivel 2");
		}
		
		ArrayList<Boolean> subNivel3 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel3();
		
		for (int i = 0; i < subNivel3.size(); i++) {
			assertTrue(subNivel3.get(i), "Erro no Subnivel 3");
		}

		ArrayList<Boolean> subNivel4 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel4();
		
		for (int i = 0; i < subNivel4.size(); i++) {
			assertTrue(subNivel4.get(i), "Erro no Subnivel 4");
		}

		boolean subNivel5 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel5();
		
		assertTrue(subNivel5, "Erro no Subnivel 5");

		ArrayList<Boolean> subNivel6 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel6();
		
		for (int i = 0; i < subNivel6.size(); i++) {
			assertTrue(subNivel6.get(i), "Erro no Subnivel 6");
		}
		

		ArrayList<Boolean> subNivel7 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel7();
		
		for (int i = 0; i < subNivel7.size(); i++) {
			assertTrue(subNivel7.get(i), "Erro no Subnivel 7");
		}
		
		ArrayList<Boolean> subNivel8 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel8();
		
		for (int i = 0; i < subNivel8.size(); i++) {
			assertTrue(subNivel8.get(i), "Erro no Subnivel 8");
		}
		
		
		ArrayList<Boolean> subNivel9 = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel9();
		
		for (int i = 0; i < subNivel9.size(); i++) {
			assertTrue(subNivel9.get(i), "Erro no Subnivel 9");
		}
	}
	
	
	@Test(priority = 7)
	public void excluirConfiguracao() {
		
		ArrayList<Boolean> sucesso = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirConfiguracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
		
		

	}
	
	@Test(priority = 8)
	public void excluirHierarquia() {
		
		ArrayList<Boolean> sucesso = hierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirHierarquia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
		
		

	}
	
		
	
}
