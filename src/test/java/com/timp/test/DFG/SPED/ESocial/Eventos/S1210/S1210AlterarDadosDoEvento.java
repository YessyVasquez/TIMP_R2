package com.timp.test.DFG.SPED.ESocial.Eventos.S1210;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1210.S1210AlterarDadosDoEventoPO;

public class S1210AlterarDadosDoEvento extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	S1210AlterarDadosDoEventoPO s1210AlterarDadosDoEventoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		s1210AlterarDadosDoEventoPO = new S1210AlterarDadosDoEventoPO();
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
		boolean sucesso = s1210AlterarDadosDoEventoPO.criarNovoEvento();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void informacao() {
		ArrayList<Boolean> sucesso = s1210AlterarDadosDoEventoPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 4)
	public void editar() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.editar();
		assertTrue(sucesso, Editar);
	}
	
	@Test(priority = 5)
	public void visualizar() {
		ArrayList<Boolean> sucesso = s1210AlterarDadosDoEventoPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 6)
	public void execucao() {
		s1210AlterarDadosDoEventoPO.execucao();
	}
	
	@Test(priority = 7)
	public void gravar() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.gravar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 8)
	public void atualizarEstructuras() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.atualizarEstructuras();
		assertTrue(sucesso, Editar);
	}
	
	@Test(priority = 9)
	public void visualizarCriarAN3() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.visualizarCriarAN3();
		assertTrue(sucesso, visualizaçar);
	}
	
	@Test(priority = 10)
	public void visualizarActualizacoes() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.visualizarActualizacoes();
		assertTrue(sucesso, visualizaçar);
	}
	
	@Test(priority = 11)
	public void gravarAN3() {
		ArrayList<Boolean> sucesso = s1210AlterarDadosDoEventoPO.gravarAN3();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 12)
	public void informacao2() {
		ArrayList<Boolean> sucesso = s1210AlterarDadosDoEventoPO.informacao2();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 13)
	public void enviarSeleccionado() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.enviarSeleccionado();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 14)
	public void enviarPendencias() {
		boolean sucesso = s1210AlterarDadosDoEventoPO.enviarPendencias();
		assertTrue(sucesso, Criar);
	}
}
