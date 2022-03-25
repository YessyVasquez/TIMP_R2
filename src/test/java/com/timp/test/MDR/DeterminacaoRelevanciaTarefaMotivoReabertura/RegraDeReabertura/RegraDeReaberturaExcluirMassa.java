package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura.RegraDeReaberturaExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegraDeReaberturaExcluirMassa extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegraDeReaberturaExcluirMassaPO regraDeReaberturaExcluirMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		regraDeReaberturaExcluirMassaPO  = new RegraDeReaberturaExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  


	@Test()
	public void criar() {
		 loginTC.login();
		 acessarMDRPO.acessarMDR();

		
		boolean sucesso = regraDeReaberturaExcluirMassaPO.Criar();
		assertTrue(sucesso, Criar);
		
	
	}
	
	@Test(dependsOnMethods = "criar")
	public void Excluir() {
		
		
		boolean sucesso2 = regraDeReaberturaExcluirMassaPO.ExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}


}
