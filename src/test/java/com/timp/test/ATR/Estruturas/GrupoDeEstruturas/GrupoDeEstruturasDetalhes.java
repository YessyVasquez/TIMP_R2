package com.timp.test.ATR.Estruturas.GrupoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas.GrupoDeEstruturasDetalhesPO;

public class GrupoDeEstruturasDetalhes extends TestBaseSteven{
 
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	GrupoDeEstruturasDetalhesPO grupoDeEstruturasDetalhesPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  grupoDeEstruturasDetalhesPO = new  GrupoDeEstruturasDetalhesPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	  @Test()
	  public void detalhes() {

		  loginTC.login();

		  acessarATRPO.acessarATR();


		  ArrayList<Boolean> sucesso = grupoDeEstruturasDetalhesPO.detalhes();
		  for (int i = 0; i < sucesso.size(); i++) {
			  assertTrue(sucesso.get(i), Detalhes);

		  }

		  sleep(2000);
	  }
}
