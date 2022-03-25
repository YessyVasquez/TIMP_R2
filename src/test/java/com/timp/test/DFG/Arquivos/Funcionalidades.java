package com.timp.test.DFG.Arquivos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Arquivos.FuncionalidadesPO;

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
	//	driver.close();
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
	public void criarNovoLeiaute() {
		boolean sucesso = funcionalidadesPO.criarLeiaute();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 3)
	public void registros() {
		boolean sucesso = funcionalidadesPO.registros();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 4)
	public void criarConfiguracao() {
		boolean sucesso = funcionalidadesPO.criarConfiguracao();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 5)
	public void executar() {
		boolean sucesso = funcionalidadesPO.executar();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 6)
	public void idPublicoPrivado() {
		boolean sucesso = funcionalidadesPO.idPublicoPrivado();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 7)
	public void favorito() {
		boolean sucesso = funcionalidadesPO.favorito();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 8)
	public void informacao() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.informacao();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
	
	@Test(priority = 9)
	public void oficializarArquivo() {
		boolean sucesso = funcionalidadesPO.oficializarArquivo();
		assertTrue(sucesso, Criar);
	}
	
	@Test(priority = 10)
	public void lixeira() {
		ArrayList<Boolean> sucesso = funcionalidadesPO.lixeira();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}
}
