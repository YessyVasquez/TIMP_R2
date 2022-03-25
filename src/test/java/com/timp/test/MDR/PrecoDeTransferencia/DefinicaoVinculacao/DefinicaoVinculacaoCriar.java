package com.timp.test.MDR.PrecoDeTransferencia.DefinicaoVinculacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.DefinicaoVinculacao.DefinicaoVinculacaoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DefinicaoVinculacaoCriar extends TestBaseSteven{
  LoginTC loginTC;
  AcessarMDRPO acessarMDRPO;
  DefinicaoVinculacaoCriarPO definicaoVinculacaoCriarPO;
  
  
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		definicaoVinculacaoCriarPO = new DefinicaoVinculacaoCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }
  /*
  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}*/

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso =definicaoVinculacaoCriarPO.criar();
		assertTrue(sucesso, Criar);
	}

}
