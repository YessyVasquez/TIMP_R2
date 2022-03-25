package com.timp.test.MDR.Reinf.R1070DadosAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosAdicionais.R1070DadosAdicionaisDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class R1070DadosAdicionaisDetalhes extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	R1070DadosAdicionaisDetalhesPO r1070DadosAdicionaisDetalhesPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
		loginTC = new LoginTC();
		accesarMDR = new AcessarMDRPO();
		r1070DadosAdicionaisDetalhesPO = new R1070DadosAdicionaisDetalhesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void detalhes() {

		loginTC.login();

		accesarMDR.acessarMDR();
		
		ArrayList<Boolean> sucesso = r1070DadosAdicionaisDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}

	}

}
