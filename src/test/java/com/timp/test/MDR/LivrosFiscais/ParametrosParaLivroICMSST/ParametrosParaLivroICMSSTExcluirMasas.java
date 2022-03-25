package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTExcluirMasas extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTExcluirMasasPO parametrosParaLivroICMSSTExcluirMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrosParaLivroICMSSTExcluirMasasPO = new ParametrosParaLivroICMSSTExcluirMasasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		
		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		

		boolean sucesso = parametrosParaLivroICMSSTExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);
		
	
	}
	
	@Test(dependsOnMethods = "criar" )
	public void Excluir() {
		
	
		boolean sucesso2 = parametrosParaLivroICMSSTExcluirMasasPO.ParametrosParaLivroICMSSTExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}
	
}
