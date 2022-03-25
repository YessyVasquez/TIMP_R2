package com.timp.test.MDR.Antecipacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AntecipacaoExcluirMassa extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AntecipacaoExcluirMassaPO antecipacaoExcluirMassaPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		antecipacaoExcluirMassaPO  = new AntecipacaoExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void criar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = antecipacaoExcluirMassaPO.criarAntecipacao();
		assertTrue(sucesso, Criar);
	}
  
  @Test(dependsOnMethods = "criar")
	public void excluir() {
		boolean sucesso = antecipacaoExcluirMassaPO.ExcluirMasas();
		assertTrue(sucesso, Eliminado);
		
		sleep(2000);
	}
}
