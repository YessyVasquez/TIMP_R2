package com.timp.test.MDR.EventosESocial.S2240CondiçõesAmbDoTrabFatDeRisco;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S2240CondiçõesAmbDoTrabFatDeRisco.S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorID extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO = new S2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO();
  }

  @AfterClass
 	public void afterClass() {
 		driver.close();
 	}


 	@Test()
	  public void filtroPorId() {
 		
		loginTC.login();

		acessarMDRPO.acessarMDR();
 		 
 		boolean dato = s2240CondiçõesAmbDoTrabFatDeRiscoFiltroPorIDPO.filtroPorId();
		   
		 assertTrue(dato, filtros);
	  }


}
