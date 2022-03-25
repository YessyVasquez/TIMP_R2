package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTEditar extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTEditarPO parametrosParaLivroICMSSTEditarPO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  parametrosParaLivroICMSSTEditarPO =new ParametrosParaLivroICMSSTEditarPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }
  


	@Test()
	public void editar() {

		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		// observaçoesdoDocumentoFiscalEditarPO.editar();
		boolean sucesso = parametrosParaLivroICMSSTEditarPO.Editar();

		assertTrue(sucesso, Editar);

	}


}
