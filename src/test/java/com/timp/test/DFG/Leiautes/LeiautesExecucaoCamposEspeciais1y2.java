package com.timp.test.DFG.Leiautes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ExecucacoMapeamentoDoSPEDPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.LeiautesExecucaoCamposEspeciais1y2PO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LeiautesExecucaoCamposEspeciais1y2 extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucaoCamposEspeciais1y2PO leiautesExecucaoCamposEspeciais1y2PO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucaoCamposEspeciais1y2PO = new LeiautesExecucaoCamposEspeciais1y2PO();
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
	public void criar() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.criarLeiaute();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 2)
	public void separadores() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.separadores();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 3)
	public void comparar() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.comparar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 4)
	public void criarConfiguracao() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.criarConfiguracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}

	@Test(priority = 5)
	public void executar() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.executar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 6)
	public void excluirConfiguracao() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.excluirConfiguracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 7)
	public void excluirLeiaute() {
		ArrayList<Boolean> sucesso =leiautesExecucaoCamposEspeciais1y2PO.excluirLeiaute();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
}
