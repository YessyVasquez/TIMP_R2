package com.timp.test.MDR.EventosESocial.S1210PagamentosDeRendimentosDoTrabalho;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.EventosESocial.S1210PagamentosDeRendimientosDoTrabalho.S1210PagamentosDeRendimientosDoTrabalhoExcluirPO;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;

public class S1210PagamentosDeRendimientosDoTrabalhoExcluir extends TestBaseFernando{
	  LoginTC loginTC;
	  AcessarMDRPO accesarMDRPO;
	  S1210PagamentosDeRendimientosDoTrabalhoExcluirPO s1210PagamentosDeRendimientosDoTrabalhoExcluirPO;
	  
	  @BeforeClass
	  public void beforeClass() {
		  driver = initializationF();
		  loginTC = new LoginTC();
		  accesarMDRPO = new AcessarMDRPO();
		  s1210PagamentosDeRendimientosDoTrabalhoExcluirPO = new S1210PagamentosDeRendimientosDoTrabalhoExcluirPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	  @Test()
	  public void excluir() {
		  loginTC.login();
		  accesarMDRPO.acessarMDR();
		  s1210PagamentosDeRendimientosDoTrabalhoExcluirPO.excluir();
	  }
}
