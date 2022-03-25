package com.timp.test.ADM.Configuração.Licenças;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.Licenças.LicençasDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LicençasDetalhes extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	LicençasDetalhesPO licençasDetalhesPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  licençasDetalhesPO = new LicençasDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test
	public void Detalles() {
		loginTC.login();
		acessarADMPO.acessarADM();
		ArrayList<Boolean> sucesso = licençasDetalhesPO.detalles();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
		sleep(2000);
	}

}
