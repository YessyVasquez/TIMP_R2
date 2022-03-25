package com.timp.test.BCB.OrigemBFB.HierarquiaConfiguracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.OrigemBFB.HierarquiaConfiguracao.OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidades extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO = new OrigenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO();
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
	public void criarConfiguracaoExecucoes() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierarquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 3)
	public void criarConfiguracionConfiguracao() {
		sleep(2000);
		boolean sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracionConfiguracao();
		assertTrue(sucesso, Criar);	
	}
	
	@Test(priority = 4)	
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracao();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 5)	
	public void outputBCB() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.outputBFB();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 6)	
	public void subNivel2() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}	
	
	@Test(priority = 7)	
	public void subNivel3() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel3();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 8)	
	public void subNivel4() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel4();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 9)	
	public void subNivel5() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 10)	
	public void abrirSubnivel1() {
		//origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel1();
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel1();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}

	@Test(priority = 11)	
	public void abrirSubnivel2() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 12)	
	public void abrirSubnivel3() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubNivel3();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 13)	
	public void abrirSubnivel4() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubNivel4();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 14)	
	public void abrirSubnivel5() {
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 15)
	public void excluirConfiguracoes() {
		
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirConfiguracoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 16)
	public void excluirHierarquia() {
		
		ArrayList<Boolean> sucesso = origenBFBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirHierarquia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}


}
