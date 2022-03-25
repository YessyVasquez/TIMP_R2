package com.timp.test.DFG.SPED.ESocial.Eventos.S1250;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1250.S1250ExcluirDadosDoEventoPO;

public class S1250ExcluirDadosDoEvento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	S1250ExcluirDadosDoEventoPO s1250ExcluirDadosDoEventoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		s1250ExcluirDadosDoEventoPO = new S1250ExcluirDadosDoEventoPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void dfgEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void criarNovoEvento() {
		boolean sucesso = s1250ExcluirDadosDoEventoPO.criarNovoEvento();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void informacao() {
		ArrayList<Boolean> sucesso = s1250ExcluirDadosDoEventoPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 4)
	public void editar() {
		boolean sucesso = s1250ExcluirDadosDoEventoPO.editar();
		assertTrue(sucesso, Editar);
	}
	
	@Test(priority = 5)
	public void visualizar() {
		ArrayList<Boolean> sucesso = s1250ExcluirDadosDoEventoPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 6)
	public void execucao() {
		s1250ExcluirDadosDoEventoPO.execucao();
	}
	
	@Test(priority = 7)
	public void gravar() {
		boolean sucesso = s1250ExcluirDadosDoEventoPO.gravar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 8)
	public void visualizarCriarAN3() {
		boolean sucesso = s1250ExcluirDadosDoEventoPO.visualizarCriarAN3();
		assertTrue(sucesso, visualizaçar);
	}
	
	@Test(priority = 9)
	public void gravarAN3() {
		ArrayList<Boolean> sucesso = s1250ExcluirDadosDoEventoPO.gravarAN3();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 10)
	public void informacao2() {
		ArrayList<Boolean> sucesso = s1250ExcluirDadosDoEventoPO.informacao2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 11)
	public void enviarSeleccionado() {
		boolean sucesso = s1250ExcluirDadosDoEventoPO.enviarSeleccionado();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 12)
	public void enviarPendencias() {
		boolean sucesso = s1250ExcluirDadosDoEventoPO.enviarPendencias();
		assertTrue(sucesso, Criar);
	}
}
