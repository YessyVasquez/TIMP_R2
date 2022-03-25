package com.timp.test.BCB.Demais.HierarquiaConfiguracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao.DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO;
import com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao.DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2 extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO = new DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO();
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

//	desde aqui dividir para hacer version 2
	
	@Test(priority = 1)
	public void ejecutarFinal() {
		demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.ejecutarFinal();
	}
	
	
	@Test(priority = 2)
	public void relacionamentoFinalyAbrirHierarquiaGrupo() {
		//demaisHierarquiaConfiguracaoTodasAsFuncionalidadesPO.resultadoFinalParte2();
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.relacionamentoFinalyAbrirHierarquiaGrupo();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	
	@Test(priority = 3)
	public void excluirConfiguracoes2() {
		
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.excluirConfiguracoes2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 4)
	public void excluirHierarquia2() {
		
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.excluirHierarquia2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 4)
	public void excluirConfiguracoes1() {
		
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.excluirConfiguracoes1();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 6)
	public void excluirHierarquia1() {
		
		ArrayList<Boolean> sucesso = demaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte2PO.excluirHierarquia1();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}

}
