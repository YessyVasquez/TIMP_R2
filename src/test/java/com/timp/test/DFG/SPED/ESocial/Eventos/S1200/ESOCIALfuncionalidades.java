package com.timp.test.DFG.SPED.ESocial.Eventos.S1200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1200.ESOCIALfuncionalidadesPO;
import com.sap.timp.pageObjectModel.DFG.SPED.REINF.SPEDREINFfuncionalidadesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ESOCIALfuncionalidades extends TestBaseSteven {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ESOCIALfuncionalidadesPO eSOCIALfuncionalidadesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		eSOCIALfuncionalidadesPO = new ESOCIALfuncionalidadesPO();
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
		boolean sucesso = eSOCIALfuncionalidadesPO.criar();
		assertTrue(sucesso, Criar);		
		
		boolean sucesso2 = eSOCIALfuncionalidadesPO.editar();
		assertTrue(sucesso2, Editar);	
		
		ArrayList<Boolean> sucesso3 = eSOCIALfuncionalidadesPO.informacao();
		
		for (int i = 0; i < sucesso3.size(); i++) {
			assertTrue(sucesso3.get(i), visualizaçar);
		}
		
		ArrayList<Boolean> sucesso4 = eSOCIALfuncionalidadesPO.visualizar();
		
		for (int i = 0; i < sucesso4.size(); i++) {
			assertTrue(sucesso4.get(i), visualizaçar);
		}
		
		boolean sucesso5 = eSOCIALfuncionalidadesPO.executar();
		assertTrue(sucesso5, visualizaçar);	

	}
	

}
