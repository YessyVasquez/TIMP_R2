package com.timp.test.BPMA.Processo.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais.ParametrosGeraisCriarProcesoRecorrentePO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio.ProcessodeNegócioCriarCopiaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisCriarProcesoRecorrente extends TestBaseKenssy {
	
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	ParametrosGeraisCriarProcesoRecorrentePO  parametrosGeraisCriarProcesoRecorrentePO;

	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  parametrosGeraisCriarProcesoRecorrentePO = new  ParametrosGeraisCriarProcesoRecorrentePO();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }
  
  
  @Test(priority = 0)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 1)
 	public void BPMAEntrar() {
 		 acessarBPMA.acessarBPMA();
 		
 	}
 	
 	@Test(priority = 1)
 	public void criar() {
 		
 		ArrayList<Boolean> sucesso = parametrosGeraisCriarProcesoRecorrentePO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
 		
 	}
}





