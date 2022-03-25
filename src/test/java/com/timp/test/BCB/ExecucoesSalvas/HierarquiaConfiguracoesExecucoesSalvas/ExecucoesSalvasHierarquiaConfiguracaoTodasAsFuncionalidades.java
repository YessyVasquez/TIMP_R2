package com.timp.test.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas.ExecucoesSalvasHierarquiaConfiguracaoTodasAsFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ExecucoesSalvasHierarquiaConfiguracaoTodasAsFuncionalidades extends TestBaseKenssy {
  
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ExecucoesSalvasHierarquiaConfiguracaoTodasAsFuncionalidadesPO hierarquiaExecucoesTodasAsFuncionalidadesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		hierarquiaExecucoesTodasAsFuncionalidadesPO = new ExecucoesSalvasHierarquiaConfiguracaoTodasAsFuncionalidadesPO();
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
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.criarConfiguracaoExecucoes();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 3)
	public void criarConfiguracao() {
		sleep(2000);
		boolean sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.criarConfiguracao();
		assertTrue(sucesso, Criar);
	
	}
	
	@Test(priority = 4)
	public void configurarConfiguracao() {
		hierarquiaExecucoesTodasAsFuncionalidadesPO.configurarConfiguracao();	
	}
	
	@Test(priority = 5)
	public void executar() {
		hierarquiaExecucoesTodasAsFuncionalidadesPO.executar();
	}	
	
	@Test(priority = 6)
	public void resto() {
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.lixeiraYRestaurar();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 7)
	public void editar() {
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.editarEditarEntradaManualImprimirExportar();
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), subniveis);
		}
	}
	
	@Test(priority = 8)
	public void excluirExecucoes() {
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.excluirExecucoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 9)
	public void excluirConfiguracoes() {
		
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.excluirConfiguracoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	@Test(priority = 10)
	public void excluirHierarquia() {
		
		ArrayList<Boolean> sucesso = hierarquiaExecucoesTodasAsFuncionalidadesPO.excluirHierarquia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
	
	
	
}
