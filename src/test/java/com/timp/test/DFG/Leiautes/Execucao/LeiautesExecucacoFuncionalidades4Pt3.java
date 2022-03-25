package com.timp.test.DFG.Leiautes.Execucao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao.LeiautesExecucacoFuncionalidades4Pt3PO;

public class LeiautesExecucacoFuncionalidades4Pt3 extends TestBaseFernando{
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	LeiautesExecucacoFuncionalidades4Pt3PO leiautesExecucacoFuncionalidades4Pt3PO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		leiautesExecucacoFuncionalidades4Pt3PO = new LeiautesExecucacoFuncionalidades4Pt3PO();
	}

	@AfterClass
	public void afterClass() {
//		driver.close();
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
	public void sequencia() {
		ArrayList<Boolean> sucesso = leiautesExecucacoFuncionalidades4Pt3PO.sequencia();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
	}
}
