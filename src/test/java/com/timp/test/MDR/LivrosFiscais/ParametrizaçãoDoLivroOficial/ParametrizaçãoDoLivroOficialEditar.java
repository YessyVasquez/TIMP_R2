package com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrizaçãoDoLivroOficialEditar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrizaçãoDoLivroOficialEditarPO parametrizaçãoDoLivroOficialEditarPO;

  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		parametrizaçãoDoLivroOficialEditarPO =new ParametrizaçãoDoLivroOficialEditarPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }
  


	@Test()
	public void Editar () {		
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = parametrizaçãoDoLivroOficialEditarPO.Editar();
		assertTrue(sucesso, Editar);
	}

}
