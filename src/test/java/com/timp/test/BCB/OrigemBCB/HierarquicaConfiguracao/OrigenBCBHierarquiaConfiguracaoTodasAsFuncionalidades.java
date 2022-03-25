package com.timp.test.BCB.OrigemBCB.HierarquicaConfiguracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas.ExecucoesSalvasHierarquiaConfiguracaoTodasAsFuncionalidadesPO;
import com.sap.timp.pageObjectModel.BCB.OrigemBCB.HierarquiaConfiguracao.OrigenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class OrigenBCBHierarquiaConfiguracaoTodasAsFuncionalidades extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	OrigenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO = new OrigenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
	////	driver.close();
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
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierarquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
@Test(priority = 3)
	public void criarConfiguracionConfiguracao() {
		sleep(2000);
		boolean sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracionConfiguracao();
		assertTrue(sucesso, Criar);	
	}
	
		@Test(priority = 4)	
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracao();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 5)	
	public void outputBCB() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.outputBCB();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
@Test(priority = 6)	
	public void subNivel2() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}	
	
		@Test(priority = 7)	
	public void subNivel3() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel3();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
			
	@Test(priority = 8)	
	public void subNivel4() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel4();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 9)	
	public void subNivel5() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	
	@Test(priority = 10)	
	public void subNivel6Negativo() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.subNivel6Negativo();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}

	
	@Test(priority = 11)	
	public void abrirSubnivel1() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel1();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}
	
	@Test(priority = 12)	
	public void abrirSubnivel2() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 13)	
	public void abrirSubnivel3() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubNivel3();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 14)	
	public void abrirSubnivel4() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubNivel4();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 15)	
	public void abrirSubnivel5() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 16)	
	public void abrirSubnivel6() {
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.abrirSubnivel6();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 17)
	public void excluirConfiguracoes() {
		
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirConfiguracoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 18)
	public void excluirHierarquia() {
		
		ArrayList<Boolean> sucesso = origenBCBHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirHierarquia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}


}
