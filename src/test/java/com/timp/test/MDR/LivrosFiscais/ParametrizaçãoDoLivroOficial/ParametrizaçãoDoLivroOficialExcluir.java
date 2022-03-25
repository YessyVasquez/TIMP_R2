package com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrizaçãoDoLivroOficialExcluir extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrizaçãoDoLivroOficialExcluirPO parametrizaçãoDoLivroOficialExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrizaçãoDoLivroOficialExcluirPO = new ParametrizaçãoDoLivroOficialExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void excluir() {	
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = parametrizaçãoDoLivroOficialExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
