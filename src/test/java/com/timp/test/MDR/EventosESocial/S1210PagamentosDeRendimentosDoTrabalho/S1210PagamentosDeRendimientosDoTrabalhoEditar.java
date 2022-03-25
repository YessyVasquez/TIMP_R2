package com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class S1210PagamentosDeRendimientosDoTrabalhoEditar extends TestBaseFernando{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  S1210PagamentosDeRendimientosDoTrabalhoEditarPO s1210PagamentosDeRendimientosDoTrabalhoEditarPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  s1210PagamentosDeRendimientosDoTrabalhoEditarPO = new S1210PagamentosDeRendimientosDoTrabalhoEditarPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  
	  @Test()
	  public void editar() {
		  loginTC.login();
		  accesarMDRPO.acessarMDR();
		  boolean sucesso = s1210PagamentosDeRendimientosDoTrabalhoEditarPO.editar();
		  assertTrue(sucesso, Editar);
	  }
}
