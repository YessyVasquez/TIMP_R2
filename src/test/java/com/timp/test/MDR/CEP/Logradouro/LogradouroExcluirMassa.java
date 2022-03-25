package com.timp.test.MDR.CEP.Logradouro;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Logradouro.LogradouroExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class LogradouroExcluirMassa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	LogradouroExcluirMassaPO logradouroExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		logradouroExcluirMassaPO = new LogradouroExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = logradouroExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
	
	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = logradouroExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}

}
