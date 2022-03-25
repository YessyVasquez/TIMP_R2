package com.timp.test.MDR.Reinf.R1070DadosAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class R1070DadosAdicionaisCriar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosAdicionaisCriarPO r1070DadosAdicionaisCriarPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosAdicionaisCriarPO = new R1070DadosAdicionaisCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void criar() {

		loginTC.login();

		accesarMDR.acessarMDR();
		
		boolean sucesso = r1070DadosAdicionaisCriarPO.Criar();
		assertTrue(sucesso, Criar);
		sleep(1000);

	}
}
