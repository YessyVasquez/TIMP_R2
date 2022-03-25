package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTVisualizar extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ParametrosParaLivroICMSSTVisualizarPO parametrosParaLivroICMSSTVisualizarPO;
 
  @BeforeClass
  public void beforeClass() {
	  
	  driver = initialization();
      loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  parametrosParaLivroICMSSTVisualizarPO =new ParametrosParaLivroICMSSTVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }



	@Test()
	public void visualizar() {
		
		loginTC.login();
		acessarMDRPO.acessarMDR();

		
	      ArrayList<Boolean> sucesso = parametrosParaLivroICMSSTVisualizarPO.Visualizar();

			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizaçar);
			}

	}
}
