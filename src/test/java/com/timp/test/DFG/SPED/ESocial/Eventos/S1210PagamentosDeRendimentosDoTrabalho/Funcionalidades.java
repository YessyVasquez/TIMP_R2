package com.timp.test.DFG.SPED.ESocial.Eventos.S1210PagamentosDeRendimentosDoTrabalho;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1210PagamentosDeRendimentosDoTrabalho.FuncionalidadesPO;

public class Funcionalidades extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	FuncionalidadesPO funcionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		funcionalidadesPO = new FuncionalidadesPO();
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
		boolean sucesso = funcionalidadesPO.criarNovoEvento();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void informacao() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 4)
	public void visualizar() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
