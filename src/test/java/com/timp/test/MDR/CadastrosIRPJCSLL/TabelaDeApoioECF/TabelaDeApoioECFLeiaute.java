package com.timp.test.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF.TabelaDeApoioECFLeiautePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TabelaDeApoioECFLeiaute extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TabelaDeApoioECFLeiautePO tabelaDeApoioECFLeiautePO;
	

  @BeforeClass
  public void beforeClass() {
	    driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tabelaDeApoioECFLeiautePO = new TabelaDeApoioECFLeiautePO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  


	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = tabelaDeApoioECFLeiautePO.Leiaute();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}
	@Test(dependsOnMethods = "criar")
	public void excluir() {
	    
		boolean sucesso = tabelaDeApoioECFLeiautePO.Excluir();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}


}
