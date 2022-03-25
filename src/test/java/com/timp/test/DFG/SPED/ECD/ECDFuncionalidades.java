package com.timp.test.DFG.SPED.ECD;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ECD.ECDFuncionalidadesPO;


public class ECDFuncionalidades extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ECDFuncionalidadesPO ecdFuncionalidadesPO;
 
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		ecdFuncionalidadesPO = new ECDFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void mdrEntrar() {
		acessarDFGPO.acessarDFG();

	}
	
	@Test(priority = 2)
	public void criarECD() {
		
		ArrayList<Boolean> sucesso = ecdFuncionalidadesPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

	}

	@Test(priority = 3)
	public void EditarECD() {
		
		boolean sucesso = ecdFuncionalidadesPO.editar();
		
		assertTrue(sucesso, Editar);


	}

	@Test(priority = 4)
	public void InformacaoECD() {
		
		boolean sucesso = ecdFuncionalidadesPO.informacao();
		assertTrue(sucesso, visualizaçar);
	}

	@Test(priority = 5)
	public void visualizacaoECD() {
		
		ArrayList<Boolean> sucesso = ecdFuncionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 6)
	public void CriarBlocoApuracao() {
		
		ArrayList<Boolean> sucesso = ecdFuncionalidadesPO.criarBlocoApuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 7)
	public void EditarBlocoApuracao() {
		
		boolean sucesso = ecdFuncionalidadesPO.editarBlocoApuracao();
		assertTrue(sucesso, Editar);
	}
	
	
	@Test(priority = 8)
	public void InformacaoBlocoApuracao() {
		
		boolean sucesso = ecdFuncionalidadesPO.informacaoBlocoApuracao();
		assertTrue(sucesso, Editar);
	}
	
	
	@Test(priority = 9)
	public void visualizarBlocoApuracao() {
		
		ArrayList<Boolean> sucesso = ecdFuncionalidadesPO.visualizarBlocoApuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 10)
	public void ExecucaoBlocoApuracao() {
		
		boolean sucesso = ecdFuncionalidadesPO.ExecucaoBlocosApuracao();
		assertTrue(sucesso, Criar);
	}
	
	
	@Test(priority = 11)
	public void visualizarAtualizacoesBlocoApuracao() {
		
		ArrayList<Boolean> sucesso = ecdFuncionalidadesPO.visualizarActualizacoes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 12)
	public void arquivosVerificar() {
		
		ArrayList<Boolean> sucesso = ecdFuncionalidadesPO.verificarArquivosRaiz();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 13)
	public void executarECD() {
		
		boolean sucesso = ecdFuncionalidadesPO.executarVariante();
		
		assertTrue(sucesso, Criar);

	}
	
	
	@Test(priority = 14)
	public void excluirVariante() {
		
		boolean sucesso = ecdFuncionalidadesPO.excluirVariante();
		
		assertTrue(sucesso, Eliminado);

	}
}
