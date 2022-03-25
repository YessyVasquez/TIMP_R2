package com.timp.test.DFG.Leiautes.Execucao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao.LeiautesExecucacoFuncionalidades4Pt2PO;

public class LeiautesExecucacoFuncionalidades4Pt2 extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucacoFuncionalidades4Pt2PO leiautesExecucacoFuncionalidades4Pt2PO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucacoFuncionalidades4Pt2PO = new LeiautesExecucacoFuncionalidades4Pt2PO();
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
	public void campoFixo() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt2PO.campoFixo();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
	
	@Test(priority = 3)
	public void campoFixoManual() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt2PO.campoFixoManual();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
}
