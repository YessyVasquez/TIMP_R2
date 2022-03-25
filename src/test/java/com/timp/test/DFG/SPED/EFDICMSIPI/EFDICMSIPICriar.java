package com.timp.test.DFG.SPED.EFDICMSIPI;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.EFDICMSIPI.EFDICMSIPICriarPO;


public class EFDICMSIPICriar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO; 
	EFDICMSIPICriarPO eFDICMSIPIpCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		eFDICMSIPIpCriarPO = new EFDICMSIPICriarPO();
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
		boolean sucesso = eFDICMSIPIpCriarPO.criar();
		assertTrue(sucesso, Criar);

	}
	
	@Test(priority = 3)
	public void criarBRE() {

		boolean sucesso2 = eFDICMSIPIpCriarPO.BRE();
		assertTrue(sucesso2, Criar);
		
	}
	

	@Test(priority = 4)
	public void criarDFGSPED() {
		
		ArrayList<Boolean> sucesso3 = eFDICMSIPIpCriarPO.DFG();
		
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), visualizaçar);
		}
		

	}
	
	
	@Test(priority = 5)
	public void editar() {
		
		boolean sucesso = eFDICMSIPIpCriarPO.editarDFG();
		
		assertTrue(sucesso, Editar);
		

	}
	
	@Test(priority = 6)
	public void informacoes() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.informacao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 7)
	public void blocoApuracao() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.blocoApuracao();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 8)
	public void blocoApuracaoExecutar() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.execucao();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		

	}
	
	@Test(priority = 9)
	public void arquivos() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.arquivos();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}
	
	@Test(priority = 10)
	public void excluirDFG() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.excluirDFG();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
	
	@Test(priority = 11)
	public void excluirBRE() {
		
		ArrayList<Boolean> sucesso = eFDICMSIPIpCriarPO.excluirBRE();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}

	}
	
	
}
