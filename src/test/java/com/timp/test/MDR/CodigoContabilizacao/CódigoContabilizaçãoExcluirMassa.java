package com.timp.test.MDR.CodigoContabilizacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao.CódigoContabilizaçãoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CódigoContabilizaçãoExcluirMassa  extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CódigoContabilizaçãoExcluirMassaPO códigoContabilizaçãoExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		códigoContabilizaçãoExcluirMassaPO = new CódigoContabilizaçãoExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	//  driver.close();
  }

	@Test()
	public void criar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = códigoContabilizaçãoExcluirMassaPO.criar();

		assertTrue(sucesso, Criar);


	}
	
	@Test(dependsOnMethods = "criar")
	public void exlcuir() {

		
		boolean sucesso = códigoContabilizaçãoExcluirMassaPO.excluir();

		assertTrue(sucesso, Eliminado);

	}


}
