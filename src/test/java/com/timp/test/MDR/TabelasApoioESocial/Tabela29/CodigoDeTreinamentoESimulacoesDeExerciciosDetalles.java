package com.timp.test.MDR.TabelasApoioESocial.Tabela29;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela29.CodigoDeTreinamentoESimulacoesDeExerciciosDetallesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CodigoDeTreinamentoESimulacoesDeExerciciosDetalles extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	 CodigoDeTreinamentoESimulacoesDeExerciciosDetallesPO  codigoDeTreinamentoESimulacoesDeExerciciosDetallesPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO(); 
	  codigoDeTreinamentoESimulacoesDeExerciciosDetallesPO = new CodigoDeTreinamentoESimulacoesDeExerciciosDetallesPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test()
	public void detalle() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> sucesso = codigoDeTreinamentoESimulacoesDeExerciciosDetallesPO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}

	}

}
