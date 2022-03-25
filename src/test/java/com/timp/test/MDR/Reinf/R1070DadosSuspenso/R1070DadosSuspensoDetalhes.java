package com.timp.test.MDR.Reinf.R1070DadosSuspenso;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosSuspenso.R1070DadosSuspensoDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class R1070DadosSuspensoDetalhes extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosSuspensoDetalhesPO r1070DadosSuspensoDetalhesPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosSuspensoDetalhesPO = new R1070DadosSuspensoDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void detalhes() {

		loginTC.login();
		accesarMDR.acessarMDR();
		
		ArrayList<Boolean> sucesso = r1070DadosSuspensoDetalhesPO.detalhes();
		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}

	}


}
