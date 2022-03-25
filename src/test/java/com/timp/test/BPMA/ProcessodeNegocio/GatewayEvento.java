package com.timp.test.BPMA.ProcessodeNegocio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio.GatewayEventoPO;
import com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio.ProcessodeNegócioCriarProcessocomTarefadeUsuárioPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class GatewayEvento extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBPMAPO acessarBPMA ;
	GatewayEventoPO  gatewayEventoPO;

	
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarBPMA = new AcessarBPMAPO();
	  gatewayEventoPO = new  GatewayEventoPO();
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
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
 		
 		ArrayList<Boolean> sucesso = gatewayEventoPO.criar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
 		
 	}

}
