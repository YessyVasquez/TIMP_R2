package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura.RegraDeReaberturaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;



public class RegraDeReaberturaCriar extends TestBaseMassiel{
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RegraDeReaberturaCriarPO  regraDeReaberturaCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		regraDeReaberturaCriarPO = new RegraDeReaberturaCriarPO();
	}


	@AfterClass
	public void afterClass() {
		//driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		accesarMDRPO.acessarMDR();
		
		  boolean sucesso = regraDeReaberturaCriarPO.Criar();
		  assertTrue(sucesso, Criar);
	  }
  

}
