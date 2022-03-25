package com.timp.test.BCB.Demais.HierarquiaConfiguracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao.DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1 extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO = new DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO();
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
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierarquia();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 3)
	public void criarConfiguracionConfiguracao() {
		sleep(2000);
		boolean sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracionConfiguracao();
		assertTrue(sucesso, Criar);	
	}
	
	@Test(priority = 4)	
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracao();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 5)	
	public void entradaManual() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.entradaManual();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 6)	
	public void campoOutput() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.campoOutput();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 7)	
	public void executar1() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.executar1();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 8)	
	public void executar2() {
		demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.executar2();
	}
	
	@Test(priority = 9)	
	public void adicionarEntradaManual2() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.adicionarEntradaManual2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 10)
	public void criarConfiguracaoHierarquia2() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracaoHierarquia2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 11)
	public void criarConfiguracionConfiguracao2() {
		sleep(2000);
		boolean sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.criarConfiguracionConfiguracao2();
		assertTrue(sucesso, Criar);	
	}
	
	@Test(priority = 12)
	public void configurarConfiguracaoRelacionamiento() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.configurarConfiguracaoRelacionamiento();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 13)
	public void relacionamentoTotalizadorSubperiodoFixoReplicar() {
		//demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.relacionamentoTotalizadorSubperiodoFixoReplicar();
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.relacionamentoTotalizadorSubperiodoFixoReplicar();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 14)
	public void resultadoFinalParte1() {
		//demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.relacionamentoTotalizadorSubperiodoFixoReplicar();
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.resultadoFinalParte1();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 15)
	public void resultadoFinalParte2() {
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.resultadoFinalParte2();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 16)
	public void resultadoDoAbaParte1() {
		//demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.resultadoFinalParte2();
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.resultadoDoAbaParte1();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	/*
	//desde aqui dividir para hacer version 2
	
//	@Test(priority = 17)
//	public void ejecutarFinal() {
//		demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.ejecutarFinal();
//	}
//	
//	
//	@Test(priority = 18)
//	public void relacionamentoFinalyAbrirHierarquiaGrupo() {
//		//demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.resultadoFinalParte2();
//		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.relacionamentoFinalyAbrirHierarquiaGrupo();
//		System.out.println(sucesso);
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), subniveis);
//		}
//	}
//	
//	
//	@Test(priority = 19)
//	public void excluirConfiguracoes2() {
//		
//		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirConfiguracoes2();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Eliminado);
//		}
//	}
//	
//	
//	@Test(priority = 20)
//	public void excluirHierarquia2() {
//		
//		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirHierarquia2();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Eliminado);
//		}
//	}
//	
//	
//	@Test(priority = 21)
//	public void excluirConfiguracoes1() {
//		
//		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirConfiguracoes1();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Eliminado);
//		}
//	}
//	
//	
//	@Test(priority = 22)
//	public void excluirHierarquia1() {
//		
//		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.excluirHierarquia1();
//		
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Eliminado);
//		}
//	}
	
	*/
}
