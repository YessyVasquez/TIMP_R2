package com.timp.test.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos.SubItensValidosExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SubItensValidosExcluirEmMassa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SubItensValidosExcluirEmMassaPO subItensValidosExcluirEmMassaPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		subItensValidosExcluirEmMassaPO  = new SubItensValidosExcluirEmMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = subItensValidosExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
	}
  
    @Test(dependsOnMethods = "criar")
	public void excluir() {
		
		boolean sucesso = subItensValidosExcluirEmMassaPO.excluirEmMassa();
		assertTrue(sucesso, Criar);
	}

}
