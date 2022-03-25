package com.timp.test.MDR.Siscoserv.NBS;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.NBS.NBSExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class NBSExcluirMassa extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	NBSExcluirMassaPO nBSExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		nBSExcluirMassaPO = new NBSExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = nBSExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	
	}
	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		
		boolean sucesso2 = nBSExcluirMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
	}
}
