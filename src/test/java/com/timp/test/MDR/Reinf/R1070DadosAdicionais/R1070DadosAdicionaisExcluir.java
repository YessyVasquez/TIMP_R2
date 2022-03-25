package com.timp.test.MDR.Reinf.R1070DadosAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class R1070DadosAdicionaisExcluir extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosAdicionaisExcluirPO r1070DadosAdicionaisExcluirPO;
  
  @BeforeClass
  public void beforeClass() {
	   driver = initializationM();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosAdicionaisExcluirPO = new R1070DadosAdicionaisExcluirPO(); 
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void Excluir() {

		loginTC.login();

		accesarMDR.acessarMDR();
		

		boolean sucesso = r1070DadosAdicionaisExcluirPO.excluir();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}
}
