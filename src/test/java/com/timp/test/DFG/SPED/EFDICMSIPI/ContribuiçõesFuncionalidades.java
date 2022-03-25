package com.timp.test.DFG.SPED.EFDICMSIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI.ContribuiçõesFuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ContribuiçõesFuncionalidades extends TestBaseSteven {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO; 
	ContribuiçõesFuncionalidadesPO contribuiçõesFuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		contribuiçõesFuncionalidadesPO = new ContribuiçõesFuncionalidadesPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void criarDFG() {
		boolean sucesso = contribuiçõesFuncionalidadesPO.criar();
		assertTrue(sucesso, Criar);

	}
	
	@Test(priority = 3)
	public void criarBRE() {

		boolean sucesso2 = contribuiçõesFuncionalidadesPO.BRE();
		assertTrue(sucesso2, Criar);
		
	}
	

	@Test(priority = 4)
	public void criarDFGSPED() {
		
		ArrayList<Boolean> sucesso3 = contribuiçõesFuncionalidadesPO.DFG();
		
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), visualizaçar);
		}
		

	}
	
	
	@Test(priority = 5)
	public void editar() {
		
		boolean sucesso = contribuiçõesFuncionalidadesPO.editarDFG();
		
		assertTrue(sucesso, Editar);
		

	}
	
	@Test(priority = 6)
	public void informacoes() {
		
		ArrayList<Boolean> sucesso = contribuiçõesFuncionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 7)
	public void blocoApuracao() {
		
		ArrayList<Boolean> sucesso = contribuiçõesFuncionalidadesPO.blocoApuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 8)
	public void blocoApuracaoExecutar() {
		
		ArrayList<Boolean> sucesso = contribuiçõesFuncionalidadesPO.execucao();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 9)
	public void arquivos() {
		
		ArrayList<Boolean> sucesso = contribuiçõesFuncionalidadesPO.arquivos();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}
	
	@Test(priority = 10)
	public void excluirDFG() {
		
		ArrayList<Boolean> sucesso = contribuiçõesFuncionalidadesPO.excluirDFG();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
	
	@Test(priority = 11)
	public void excluirBRE() {
		
		ArrayList<Boolean> sucesso = contribuiçõesFuncionalidadesPO.excluirBRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
	

}
