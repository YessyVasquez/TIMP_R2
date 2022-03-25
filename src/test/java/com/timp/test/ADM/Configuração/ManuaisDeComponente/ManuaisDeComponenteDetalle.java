package com.timp.test.ADM.Configuração.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente.ManuaisDeComponenteDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ManuaisDeComponenteDetalle extends TestBaseMassiel{ 
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponenteDetallePO manuaisDeComponenteVisualizarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  manuaisDeComponenteVisualizarPO = new ManuaisDeComponenteDetallePO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }


	
	@Test()
	public void detalle() {
		loginTC.login();
		acessarADMPO.acessarADM();
		
		ArrayList<Boolean> sucesso = manuaisDeComponenteVisualizarPO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(2000);
	}
	
}
