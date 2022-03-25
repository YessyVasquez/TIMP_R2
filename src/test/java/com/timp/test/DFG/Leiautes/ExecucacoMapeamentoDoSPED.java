package com.timp.test.DFG.Leiautes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.ExecucacoMapeamentoDoSPEDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ExecucacoMapeamentoDoSPED extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ExecucacoMapeamentoDoSPEDPO execucacoMapeamentoDoSPEDPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		execucacoMapeamentoDoSPEDPO = new ExecucacoMapeamentoDoSPEDPO();
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
		ArrayList<Boolean> sucesso =execucacoMapeamentoDoSPEDPO.criarLeiaute();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	
	@Test(priority = 3)
	public void criarSPED() {
		ArrayList<Boolean> sucesso =execucacoMapeamentoDoSPEDPO.criarSPED();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 4)
	public void executar() {
		ArrayList<Boolean> sucesso =execucacoMapeamentoDoSPEDPO.executar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 5)
	public void excluir() {
		ArrayList<Boolean> sucesso =execucacoMapeamentoDoSPEDPO.excluir();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Eliminado);
		}
	}

}
