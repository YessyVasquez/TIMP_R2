package com.timp.test.MDR.TabelasApoioESocial.Tabela20;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela20.TiposDeLogradouroDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class TiposDeLogradouroDetalle extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLogradouroDetallePO tiposDeLogradouroDetallePO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLogradouroDetallePO = new TiposDeLogradouroDetallePO();
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }

  @Test()
 	public void detalle() {

 		loginTC.login();
 		acessarMDRPO.acessarMDR();

 		
 		ArrayList<Boolean> sucesso = tiposDeLogradouroDetallePO.Detalle();

 		for (int i = 0; i < sucesso.size(); i++) {
 			assertTrue(sucesso.get(i), visualizaçar);
 		}

 	}
}
