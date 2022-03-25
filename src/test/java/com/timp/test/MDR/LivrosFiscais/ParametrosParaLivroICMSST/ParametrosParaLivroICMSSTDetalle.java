 package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTDetallesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTDetalle extends TestBaseSteven{
	
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTDetallesPO parametrosParaLivroICMSSTDetallesPO;

  @BeforeClass
  public void beforeClass() {
	  
	  driver = initialization();
      loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  parametrosParaLivroICMSSTDetallesPO =new ParametrosParaLivroICMSSTDetallesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }



 	@Test()
 	public void detalhes() {
 		
 		loginTC.login();
 		
 		acessarMDRPO.acessarMDR();
 		
 		
 	      ArrayList<Boolean> sucesso = parametrosParaLivroICMSSTDetallesPO.Detalles();

 			for (int i = 0; i < sucesso.size(); i++) {
 				assertTrue(sucesso.get(i), visualizaçar);
 			}

 	}
}
