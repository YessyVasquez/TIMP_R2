package com.timp.test.BCB.Formula.HierarquiaConfiguracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.Formula.HierarquiaConfiguracao.FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2 extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO = new FormulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO();
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
	
	@Test(priority = 9)	
	public void subNivel5() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.subNivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 10)	
	public void abrirSubnivel1() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.abrirSubnivel1();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		} 
	}
	
	
	@Test(priority = 12)	
	public void abrirSubnivel2() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.abrirSubnivel2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 13)	
	public void abrirSubnivel3() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.abrirSubNivel3();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 14)	
	public void abrirSubnivel4() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.abrirSubNivel4();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}	 
	}
	
	@Test(priority = 15)	
	public void abrirSubnivel5() {
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.abrirSubNivel5();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 16)
	public void excluirConfiguracoes() {
		
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.excluirConfiguracoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 17)
	public void excluirHierarquia() {
		
		ArrayList<Boolean> sucesso = formulaHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.excluirHierarquia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}

}
